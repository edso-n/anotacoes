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

/* 
Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
*/

public class Main{
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Edson", 333);
        ContaBancaria conta2 = new ContaBancaria("Num", 777);

        conta1.alterarConta();
        conta2.alterarConta();

        conta1.depositar(1000);
        System.out.println(conta1.getSaldo());
        

        System.out.println(conta2.getSaldo());

        conta1.transferencia(conta2, 200);
        System.out.println(conta2.getSaldo());
        System.out.println(conta1.getSaldo());
        
    }
}