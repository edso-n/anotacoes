## 📦 Configuração de Containers

### 🧠 Sobre

Trata-se de uma arquitetura multimodal utilizando LLMs.
Atualmente são usadas três ferramentas principais:

* **Ollama**
* **OpenWebUI**
* **LLMlite**

#### 🔗 Integração entre os serviços

* **OpenWebUI**
  Interface gráfica do usuário.
  Conectada ao **LLMlite** pela rede local na porta **4000**.

* **LLMlite**
  Atua como maestro/gerenciador responsável por decidir qual modelo de IA será utilizado.
  Conecta-se aos containers do **Ollama** em diferentes portas.

* **Ollama**
  Responsável pelo download e execução dos modelos de IA.

---

### 🐳 Criando Containers

#### OpenWebUI

```bash
docker run --detach --interactive --tty --name ctrOpenweb --workdir /openweb --network host andrelanna/openweb-ui:0.6.4 bash
```
#### Ollama

```bash
docker run --detach --interactive --tty --name ctrOllama --workdir /ollama --network host andrelanna/ollama bash
```
#### LLMlite

```bash
docker run -d \
    --name ctrLLMlite \
    --network host \
    -v $(pwd)/litellm_config.yaml:/app/config.yaml \
    docker.litellm.ai/berriai/litellm:main-latest \
    --config /app/config.yaml
```    

### 🐳 Rodando Containers

#### OpenWebUI

```bash
docker start ctrOpenweb 
docker exec --interactive --tty --name ctrOpenweb bash
open-webui serve
```
#### Ollama

```bash
docker start ctrOllama 
docker exec  --interactive --tty --name ctrOllama bash
ollama serve
OLLAMA_HOST=127.0.0.1:11435 ollama serve #INICIA UM SEGUNDO CONTAINER NA PORTA 11435
```
#### LLMlite

```bash
docker start ctrLLMlite
```  

Para ver os logs (Qual modelo está te respondendo)

```bash
docker logs -f ctrLLMlite 2>&1 | grep -E "model|downstream"
```


# CAMINHOS
---

### Nível 1: O "Fallback" (Automação de Falha)

**Cenário:** Você quer usar o **Llama 3** sempre. Mas se ele estiver travado ou o container cair, o sistema deve mudar automaticamente para o **DeepSeek** sem te dar erro.

**Como fazer no YAML:**
Você cria um modelo principal e define uma lista de "backups".

```yaml
model_list:
  - model_name: gpt-automatico #nome do modelo
    litellm_params:
      model: ollama/llama3
      api_base: http://localhost:11434
      fallback_models: ["backup-model"] # Se falhar, chama este

  - model_name: backup-model # O modelo de segurança
    litellm_params:
      model: ollama/mistral
      api_base: http://localhost:11435 #em outro container

```

---

### Nível 2: Balanceamento de Carga (Automação de Velocidade)

**Cenário:** 2 containers Ollama rodando o mesmo modelo. O LiteLLM manda o prompt para aquele que estiver **menos ocupado** ou responda **mais rápido**.

**Como fazer no YAML:**
Você usa o mesmo `model_name` para várias entradas. O LiteLLM entende que é um grupo.

```yaml
model_list:
  - model_name: gpt-turbo # Nome igual
    litellm_params:
      model: ollama/llama3
      api_base: http://localhost:11434 # Servidor 1

  - model_name: gpt-turbo # Nome igual
    litellm_params:
      model: ollama/llama3
      api_base: http://localhost:11435 # Servidor 2

router_settings:
  routing_strategy: usage-based-routing-v2 # Manda para quem está trabalhando menos
  # ou use: latency-based-routing (Manda para quem responde mais rápido)

```

---

### Nível 3: Roteamento Semântico (O "Santo Graal")

**Cenário:** É o que você perguntou.

* Prompt: *"Crie uma função em Python..."* -> **LiteLLM detecta e manda para o DeepSeek Coder.**
* Prompt: *"Resuma este texto..."* -> **LiteLLM detecta e manda para o Llama 3.**

**A Verdade:**
Fazer isso **apenas pelo YAML** é limitado. O LiteLLM Proxy suporta roteamento básico por regex (palavras-chave), mas para uma inteligência real, geralmente usamos uma biblioteca auxiliar chamada `semantic-router` (que também é open-source e integra com o LiteLLM).

**Mas... dá para fazer um "truque" com Regex no YAML!**
Você pode tentar configurar rotas baseadas no conteúdo do prompt, embora seja um recurso mais avançado e experimental no config.

Exemplo conceitual de como seria a lógica (via Python SDK seria mais robusto, mas via config tentamos assim):

```yaml
router_settings:
  model_group_alias:
    "gpt-code": "ollama/deepseek-coder"
    "gpt-chat": "ollama/llama3"

```

No entanto, a maneira mais sólida de fazer isso num projeto de Engenharia de Software é criar um pequeno **script Python** que usa a biblioteca `litellm` em vez de usar apenas o binário do Proxy.

### O "Pulo do Gato" para o seu Projeto (Open WebUI Functions)

Como você já usa o **Open WebUI**, existe um jeito mais fácil de fazer essa mágica sem mexer no LiteLLM!

O Open WebUI tem um recurso chamado **Filters (Functions)**.

1. No Open WebUI, vá em **Workspace > Functions**.
2. Você pode criar um filtro em Python que analisa o prompt antes de enviar.
3. Se o prompt contiver palavras como `def`, `class`, `python`, `code`, você força a troca do modelo (model override).

**Você quer que eu gere esse script Python para você colocar dentro do Open WebUI e fazer essa troca automática?** (É a solução mais elegante para o seu stack atual). 