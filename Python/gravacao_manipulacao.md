# Python
--------------------------------------------------------------------------------------------------------------
# Arquivos txt
## Função open()
Permite abrir/manipular arquivos no python, recebe dois argumento: o caminho de destino e o modo (w,r,x).

### Escrita(w)
```python
with open("dados.txt", 'w') as a f:
    f.write("Olá mundo!")
```
O resultado será um arquivo .txt escrito Olá mundo!. Ocorre sobrescrita

### Escrita no final do texto(a)
```python
with open("dados.txt", 'a') as f:
    f.write("\nJe parle avec mon frere")
```
O resultado será essa frase adicionada na última linha do arquivo (append)

### Leitura(r)
```python
with open("dados.txt", 'r') as a f:
    print(f.read())
```
O arquivo será lido e sseu conteúdo impresso no terminal.
--------------------------------------------------------------------------------------------------------------
# Arquivos csv