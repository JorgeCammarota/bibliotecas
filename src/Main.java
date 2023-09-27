
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Ficção Científica", "Duna", "978-0450040864", "Frank Herbert");
        Livro livro2 = new Livro("Fantasia", "Harry Potter e a Pedra Filosofal", "978-8532530789", "J.K. Rowling");
        Livro livro3 = new Livro("Romance", "Orgulho e Preconceito", "978-8532513782", "Jane Austen");

        livro1.mostrarInformacoes();
        livro2.mostrarInformacoes();
        livro3.mostrarInformacoes();

        Livro.registrarLivro("879-6785678989", "Fantasia", "Ficção Científica", "William Gibson");
        Livro.registrarLivro("007-009871246789", "Aventura", "Ficção Científica", "William Gibson");
        Livro.registrarLivro("009-0345301453", "Terror", "Ficção Científica", "William Gibson");
        Livro.registrarLivro("558-6734590876", "Neuromancer", "Ficção Científica", "William Gibson");
    }
}