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
public class Main{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        if(numero < 10){
            System.out.println("É menor que 10");
        }
        else{
            System.out.println("É maior que 10");
        }

    }
}
```