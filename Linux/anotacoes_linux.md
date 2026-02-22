# Linux e Bash

## Comandos bśicos

```bash
pwd #(Print Working Directory): Exibe o caminho completo do diretório atual em que você está no terminal.
```

```bash
ls #(List): Lista os arquivos e diretórios no diretório atual. Com a opção -a, exibe também arquivos ocultos.
```

```bash
cd #(Change Directory): Altera o diretório atual para o especificado. Exemplo (cd /projeto muda para o diretório projeto.
```

```bash
sudo #(SuperUser Do): Permite a execução de comandos com privilégios de superusuário (root). Exemplo (sudo ls /root exibe o conteúdo do diretório root com permissões elevadas.
```

```bash
sudo -i #Inicia uma sessão de shell interativa como usuário root, permitindo executar comandos com permissões administrativas sem precisar prefixar cada comando com sudo.
```

```bash
sudo su # Abre uma sessão de shell como usuário root, mantendo o ambiente do usuário atual. Semelhante a sudo -i, mas mantém o ambiente do usuário.
```

```bash
cat # (Concatenate): Exibe o conteúdo de arquivos. Pode também ser usado para concatenar e criar arquivos.
```

```bash
exit #: Encerra a sessão atual de shell, seja ela como usuário normal ou root.
```

```bash
git clone # Cria uma cópia local de um repositório Git remoto. Exemplo: git clone https://github.com/alura-cursos/adopet-frontend-cypress clona o repositório 
```

```bash
touch nome_arquivo.txt #Cria um arquivo vazio
```

```bash
mv arquivo_a_ser_movido detino_final
```

```bash
cp arquivo_a_ser_copiado nome_do_arquivo_copia #Copia um arquivo
```

```bash
rm -i #(Remove Interactive): Remove arquivos 
```

```bash
rmdir #remove diretórios
```

```bash
rm -i #Remoção interativa -pergunta se pode remover
```

```bash
rm -r #remove diretórios e seu conteúdo de forma recursiva
```

```bash
ls > arquivo.txt #Redireciona a saída do comando ls para o arquivo.txt (Criando-o caso não exista)
```

```bash
ls >> arquivo.txt #faz a mesma coisa do anterior, mas ao invés de sobrescrever ele adiciona ao final do arquivo
```

```bash
echo "Olá mundo" >> arquivo.txt #Adiciona "Olá mundo" na ultima linha do arquivo.txt
```

```bash
sudo apt update #procura e lista atualizações
sudo apt upgrade #Atualiza de fato
```