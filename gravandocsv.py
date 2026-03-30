import csv

with open("dados.csv", 'w') as f:
    escritor = csv.writer(f)
    escritor.writerow(['Nome', 'Idade'])
    escritor.writerow(["Edson", 21])
    escritor.writerow(["Exemplo", 77])