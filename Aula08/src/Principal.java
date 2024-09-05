import java.util.Scanner;

public class Principal {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * ex01();
         * ex02();
         * ex03();
         * ex04();
         */
        ex05();
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

    public static void ex03() {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(1);
        // System.out.println("N° da conta: " + conta.getNumeroConta());

        conta.setTitularConta("Fulano da Silva");
        conta.setSaldo(250.45f);

        ContaBancaria conta2 = new ContaBancaria(2, "Narancha", 3687.56f);
        // Alterar nome da conta2
        conta2.setTitularConta("Marlinda da Silva Sato");

        // Mostrar dados da conta1
        System.out.println("Conta N°: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitularConta());
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        // Mostrar dados da conta2:
        conta2.exibirDadosConta();

        // Operaçoes com as contas:
        // Depositar e Sacar valores da conta:
        conta.depositar(1750);
        conta.sacar(1923.40f);

        // Sacara e Depositar na conta2:
        conta2.sacar(3000);
        conta2.depositar(450);

    }

    public static void ex04() {
        Jogador player1 = new Jogador("Fulano", 100, 1);
        Jogador player2 = new Jogador("Beltrano", 200, 2);

        player1.aumentarPontuacao(100);
        player1.subirNivel();
        player1.aumentarPontuacao(50);

        player2.aumentarPontuacao(300);
        player2.subirNivel();
        player2.subirNivel();
    }

    public static void ex05() {
        Carro carro1 = new Carro();

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
    }
}
