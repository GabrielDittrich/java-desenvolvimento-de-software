public class Biblioteca {

    String titulo;
    String autor;
    int ano;

    // Construtor da Classe
    public Biblioteca() {
    }

    public Biblioteca(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exbLivro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de públicação: " + ano);
    }

    

}
