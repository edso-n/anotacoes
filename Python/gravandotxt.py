""" with open("dados.txt", 'w') as f:
    f.write("Selva, Brasil, pão") """
    
with open("Python/dados.txt", 'r') as f:
    print(f.read())    
    
with open("Python/dados.txt", 'a') as f:
    f.write("\nJe parle avec mon frere")
    
with open("dados.txt", 'r') as f:
    print(f.read())            