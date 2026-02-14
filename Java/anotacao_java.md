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
        float tamanho = 0.9f;
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
import java.util.Scanner;

public class Main{
    Scanner leitura = new Scanner(System.in);
    public static void main(String[] args){
        int online = 0;

        while(online < 10){
            System.out.println("Vou somar +1");
            online++;
            System.out.println(online);
        }
    }
}
```

## Exemplo de classe

```java

public class ContaBancaria {
    private int numeroConta;
    private float saldo = 0;
    private String titular;
    private boolean contaCorrente = false;

        //CONSTRUTOR
        public ContaBancaria(String titular, int numeroConta){
            this.titular = titular;
            this.numeroConta = numeroConta;
            this.saldo = 0;
        }

        int getNumeroConta(){
            return numeroConta;
        }

        float getSaldo(){
            return saldo;
        }

        String getTitular(){
            return titular;
        }

        boolean getContaCorrente(){
            return contaCorrente;
        }

        boolean sacar(int valor){
            if((contaCorrente == true) && (valor <= saldo)){
                saldo -= valor;
                System.out.println(valor + " sacado com sucesso!");
                return true;
            }
            else if (contaCorrente == true){
                System.out.println("Sua conta não é corrente!");
                return false;
            }
            else{
                System.out.println("Saldo insuficiente!");
                return false;
            }
        }

        void depositar(int valor){
            if(valor > 0 && contaCorrente == true){
                saldo += valor;
                System.out.println(valor + " depositado com sucesso!");
            }
            else if (valor < 0){
                System.out.println("Digite um valor positivo!");
            }
            else{
                System.out.println("Para operação desse tipo transforme sua conta em corrente!");
            }
        }

        void alterarConta(){
            if (contaCorrente == true) {
                contaCorrente = false;
                System.out.println("Conta: " + numeroConta + " alterada para Poupança");
            }
            else{
                contaCorrente = true;
                System.out.println("Conta: " + numeroConta + " alterada para Corrente");
            }
        }

        void transferencia(ContaBancaria conta, int valor){
            if(sacar(valor)){
                conta.depositar(valor);
                System.out.println("Transferencia realizada com sucesso!");
            }
            else{
                System.out.println("Erro na transferência!");
            }
        }
}

```

## Herança em Java

```java
// A classe ContaCorrente herda tudo de ContaBancaria
public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, int numero, double limite) {
        super(titular, numero); // Chama o construtor da classe pai
        this.limiteChequeEspecial = limite;
    }
}
```

## Arrays

```java
    import java.util.ArrayList;

// Array fixo (tamanho não muda)
int[] numeros = new int[5];
numeros[0] = 10;

// ArrayList (tamanho flexível) - O mais usado no dia a dia
List<String> listaDeNomes = new ArrayList<>();
listaDeNomes.add("Neymar");
listaDeNomes.add("Messi");
listaDeNomes.remove(0);
```

## Polimorfismo

```java
@Override
public boolean sacar(int valor) {
    // Lógica de saque específica para conta corrente com taxa, por exemplo
    System.out.println("Saindo dinheiro da conta corrente...");
    return super.sacar(valor); // Usa a lógica original do pai
}
```

## Interface

```java
//Implementa um contrato. O Java te obriga a implementar esse método.

public interface Tributavel {
    double calcularImposto();
}

public class ContaInvestimento extends ContaBancaria implements Tributavel {
    @Override
    public double calcularImposto() {
        return this.getSaldo() * 0.01;
    }
}
```

## Tratamento de erros

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro: Não é possível dividir por zero!");
} finally {
    System.out.println("Isso sempre será executado (útil para fechar conexões)");
}
```