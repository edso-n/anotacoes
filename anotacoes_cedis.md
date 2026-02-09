## Configuração de containers

# Sobre:
    Trata-se de uma arquitetura multimodal usando LLMs. Utilizamos de três ferramentas até agora: Ollama, OpenWeb, LLMlite.
    O OpenWeb é a ferramenta de interface gráfica do usuário, ele está ligado ao LLMlite pela rede local na porta 4000.
    O LLMlite funciona como o maestro/gerenciador que controla qual IA deve ser utilizada. Ele está ligado aos container Ollama em diferentes portas.
    O Ollama é a ferramenta que permite baixar os modelos de IA.

# Criando um container 
- OpenWebUI:
    `docker run --detach --interactive --tty --name ctrOpenweb workdir /openweb --network host andrelanna/openweb-ui:0.6.4 bash`