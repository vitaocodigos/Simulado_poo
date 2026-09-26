public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "Brasileiro");
        Livro livro = new Livro("Dom Casmurro", 45.90, autor);
        
        livro.exibirDetalhes();
    }
}