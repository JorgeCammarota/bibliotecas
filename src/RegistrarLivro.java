
public class RegistrarLivro {
    public static void registrarLivro(String isbn) {
        System.out.println("O livro foi registrado com o isbn " + isbn);
    }

    public static void registrarLivro(String isbn, String nome) {
        System.out.println("O livro foi registrado com o isbn " + isbn + " e o nome " + nome);
    }

    public static void registrarLivro(String isbn, String nome, String genero) {
        System.out.println("O livro foi registrado com o isbn " + isbn + ", o nome " + nome + " e o gênero " + genero);
    }

    public static void registrarLivro(String isbn, String nome, String genero, String autor) {
        System.out.println("O livro foi registrado com todos os atributos");
    }

    public void mostrarInformacoes() {
        String genero;
        System.out.println("Gênero: " + "genero");
        System.out.println("Nome do Livro: " + "nome");
        System.out.println("ISBN: " + "isbn");
        System.out.println("Autor: " + "autor");
    }
}