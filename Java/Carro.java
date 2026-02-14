package Java;

//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

public class Carro {
    String modelo;
    int ano;
    String cor;

        void exibir_ficha(){
            System.out.println("Modelo do carro: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Cor do carro: " + cor);
        }

        void calcular_idade(){
            int idade = 2026 - ano;
            System.out.println("A idade do carro é " + idade + " anos");
        }
}
