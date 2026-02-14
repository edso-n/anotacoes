package Java;

/*Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a 
música e calcular a média de avaliações.*/

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    float avaliacao = 0;
    int numAvaliacoes;
    float notamed;

        void avaliar(float nota){
            avaliacao += nota;
            numAvaliacoes++;
        }

        float media(){
            notamed = (avaliacao/numAvaliacoes);
            return notamed;
        }

        void exibir_ficha(){
            System.out.println("Nome da música: " + titulo);
            System.out.println("Artista: " + artista);
            System.out.println("Ano de lançamento: " + anoLancamento);
            System.out.println("Nota média: " + notamed);
        }


    
}
