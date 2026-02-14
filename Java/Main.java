package Java;
/*
    Na programação orientada a objetos, conceitos fundamentais como classe, métodos, atributos e instanciação desempenham papéis cruciais na organização e estruturação do código.

Compreender esses conceitos é fundamental para a programação orientada a objetos, pois proporciona uma estrutura organizada, modular e reutilizável ao código. 
Para aprimorar essas habilidades, criamos uma lista de atividades (não obrigatórias) focada na prática para melhorar ainda mais sua experiência de aprendizagem. Vamos praticar?

Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
*/

public class Main{
    public static void main(String[] args) {
        /*Ola chama = new Ola();
        chama.chamador();

        Calculadora cal = new Calculadora();
        System.out.println(cal.dobro(64));

        Musica m1 = new Musica();
        m1.artista = "Matuê";
        m1.titulo = "333";
        m1.anoLancamento = 2024;
        m1.avaliar(10);
        m1.avaliar(8);

        m1.media();

        m1.exibir_ficha();*/

        /*Carro car1 = new Carro();
        car1.modelo = "ferrari";
        car1.cor = "Vermelha";
        car1.ano = 2019;

        car1.exibir_ficha();
        car1.calcular_idade();*/

        Aluno a1 = new Aluno();
        a1.nome = "Edson";
        a1.idade = 21;
        a1.exibir_info();
    }
}