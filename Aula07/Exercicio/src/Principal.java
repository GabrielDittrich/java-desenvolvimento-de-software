import java.util.Scanner;

public class Principal {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        ex02();
    }

    public static void ex01() {
        /*
         * Biblioteca biblioteca = new Biblioteca();
         * 
         * // Criando livros e adicionandos a biblioteca
         * biblioteca = new Biblioteca("Livro 01", "Autor 01", 2008);
         * System.out.println(biblioteca.titulo);
         * System.out.println("Titulo do Livro: ");
         */
        /*
         * Biblioteca b1 = new Biblioteca();
         * b1.titulo = leitor.nextLine();
         * 
         * System.out.println("Autor: ");
         * b1.autor = leitor.nextLine();
         * 
         * System.out.println("Ano de Publicação: ");
         * b1.ano = leitor.nextInt();
         * 
         * System.out.println("Titulo do livro: " + b1.titulo + "\nAutor: " + b1.autor +
         * "\nAno de públicação: " + b1.ano);
         */
        Biblioteca b2 = new Biblioteca("Livro01", "Jao ze", 2004);

        b2.exbLivro();
    }

    public static void ex02() {

        Calculadora calc = new Calculadora();
        float n1;
        float n2;
        float result;

        System.out.println("Informe dois valores reais: ");
        System.out.print("Primeiro valor: ");
        n1 = Console.lerFloat();
        System.out.print("\nInforme o segundo valor: ");
        n2 = Console.lerFloat();

        result = calc.somar(n1, n2);
        System.out.println("\nA soma desses valores é: " + result);

        result = calc.subtrair(n1, n2);
        System.out.println("A subtração desses valores é: " + result);

        result = calc.multiplicar(n1, n2);
        System.out.println("A multiplicação desses valores é: " + result);

        result = calc.dividir(n1, n2);
        System.out.println("A divisão desses valores é " + result);
    }
}
