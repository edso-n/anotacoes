# JAVA

## Hello World

```java
public class Main{
    public static void main(String[] args){
        System.out.println("Olá mundo!");
    }
}
```

## Atribuindo valores a variáveis

```java
public class Main{
    public static void main(String[] args){
        int numero = 10;
        float tamanho = 0.9;
        char letra = 'c';
        String nome = "Neymar";
        boolean sei = true;
    }
}
```

## Coletando input do teclado

```Java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();
        leitura.close();
        System.out.println("Bem vindo " + nome);

    }
}
```

## Estrutura de decisão

```Java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        if (numero > 0){
            System.out.println("O valor: " + numero + " é positivo");
        }
        else if (numero == 0){
            System.out.println("O valor " + numero + " é igual a zero");
        }
        else{
            System.out.println("O valor " + numero + " é negativo");
        }
    }
}
```
## Switch case

```Java
public class Main {
  public static void main(String[] args) {
  
      int mes = 10;
      
      switch (mes) {
          case 1:  
              System.out.println("Janeiro");
              break;
          case 2:
              System.out.println("Fevereiro");
              break;
          case 3:  
                System.out.println("Março");
              break;
          case 4:  
              System.out.println("Abril");
              break;
          case 5:  
              System.out.println("Maio");
              break;
          case 6:  
              System.out.println("Junho");
              break;
          case 7:
              System.out.println("Julho");  
              break;
          case 8:  
              System.out.println("Agosto");
              break;
          case 9:  
              System.out.println("Setembro");
              break;
          case 10: 
              System.out.println("Outubro");
              break;
          case 11: 
              System.out.println("Novembro");
              break;
          case 12: 
              System.out.println("Dezembro");
              break;
          default: 
              System.out.println("Mês inválido");
              break;
      }
  }
}
```

## Estrutura de repetição
### Laço for

```java
    public class Main{
    public static void main(String[] args){
        //CRESCENTE
        for(int i=0; i<10;i++){
            System.out.println(i);
       }

       //DECRESCENTE
       for (int i = 10; i > 0; i--) {
            System.out.println(i);
       }
    }
}
```

### While

```java

```