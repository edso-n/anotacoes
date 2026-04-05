import csv

#-------------CRIANDO A TABELA------------
with open("Python/dados.csv", 'w') as f:
    escritor = csv.writer(f)
    escritor.writerow(['Nome', 'Idade'])
    escritor.writerow(["Edson", 21])
    escritor.writerow(["Exemplo", 77])
    
#-----------LENDO A TABELA-----------------
with open("Python/dados.csv", newline='') as f:
    leitor = csv.reader(f)
    for linha in leitor:
        print(linha)    