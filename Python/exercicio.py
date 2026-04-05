#O que você deve fazer:

 #   Crie um programa que grave em um arquivo alunos.csv uma lista de alunos e suas notas.
  #  Leia o arquivo alunos.csv e imprima apenas os alunos com nota maior ou igual a 7.0.

import csv  
notas = {"Edson": 10, "Pedro": 7, "Fiodor": 9, "Macron": 5, "Trump": 7}

with open("Python/alunos.csv", 'w') as f:
    escrever = csv.writer(f)
    for alunos in notas:
        escrever.writerow([f"{alunos}", f"{notas[alunos]}"])
        
with open("Python/alunos.csv", 'r') as f:
    leitura = csv.reader(f)
    for linha in leitura:
        print(linha)         

