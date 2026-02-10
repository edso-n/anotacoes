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
