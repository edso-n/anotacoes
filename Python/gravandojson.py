import json

informacoes = {"nome": "Edson", "idade": 21, "Sexo" : 'M'}

#--Cria um arquivo json com base em um dicionário------
with open("Python/dados.json", 'w') as f:
    json.dump(informacoes, f)

#--Leitura do json--------------------------------------    
with open("Python/dados.json", 'r') as f:   
    print(json.load(f))