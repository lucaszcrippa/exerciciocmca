
package exercicio2;


public class Exercicio2 {

    
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia");
        livro1.exibirInformacoes();
        
        
        if (livro1.pertenceAoGenero("Fantasia")) {
            System.out.println("O livro pertence ao gênero Fantasia.");
        } else {
            System.out.println("O livro não pertence ao gênero Fantasia.");
        }
    }
}