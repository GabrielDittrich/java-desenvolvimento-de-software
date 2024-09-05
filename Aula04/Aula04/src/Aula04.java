import java.util.Scanner;

public class Aula04 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("\n***Menu***\n");
            System.out.println("1) Exemplo do vetor número 1 ");
            System.out.println("2) Exemplo do vetor número 2");
            System.out.println("3) Exemplo do vetor número 3");
            System.out.println("0) Sair ");
            System.out.print("Informe a opção: ");

            menu = leitor.nextInt();

            switch (menu) {
                case 1:
                    exVetor01();
                    break;
                case 2:
                    exVetor02();
                    break;
                case 3:
                    exVetor03();
                    break;
                case 0:
                    System.out.println("Tchauzinho!!");
                    break;
                default:
                    System.out.println("VALOR INVÁLIDO");
                    break;
            }
        } while (menu != 0);
    }

    public static void exVetor01() {
        /*
         * Ler 5 valores inteiros e armazenalos em um vetor
         * Mostrar os valores do vetor
         */
        System.out.println("Exemplo do Vetor número 01:");

        /* Declarar vetor */
        int[] bolinho = new int[5];

        for (int i = 0; i < bolinho.length; i++) {
            System.out.print("Informe o valor para a pos " + i + ": ");
            bolinho[i] = leitor.nextInt();
        }
        System.out.println("\nVetor Gerado: ");

        for (int i = 0; i < bolinho.length; i++) {
            System.out.print(bolinho[i] + " ");
        }
    }

    public static void exVetor02() {
        /*
         * Leia um valor inteiro entre 1 e 10
         * Enquanto for digitado um valor fora desse intervalo
         * Solicite ao usuário para digitar novamente.
         * Crie um vetor com o mesmo tamanho do valor lido.
         * Leia os valores e depois apresente apenas os valores pares
         * do vetor na tela
         */
        System.out.println("\nExemplo do Vetor número 2");
        int tamanho;

        do {
            System.out.print("Informe o tamanho do vetor entre 2 e 10: ");
            tamanho = leitor.nextInt();
        } while (tamanho < 2 | tamanho > 10);

        int[] vetor = new int[tamanho];

        System.out.println("\nLeitura do vetor de " + tamanho + " pos: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Pos " + i + ": ");
            vetor[i] = leitor.nextInt();
        }

        System.out.print("Valores pares do vetor: ");
        for (int i = 0; i < vetor.length; i++) {

            // Mostrar apenas valores pares
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i] + " ");
            }
        }
    }

    public static void exVetor03() {
        /*
         * Criar um vetor de 5 posições com valores definidos em
         * sua declaração. Mostrar na tela apenas os valores que
         * sejam menores que o seu indice
         */
        int[] vet = { 10, 5, 1, 2, 45 };

        System.out.println("\nExemplo do Vetor número 03");
        System.out.print("Valores menores que seus indíces: ");

        for (int i = 0; i < vet.length; i++) {

            if (vet[i] < i) {
                System.out.println("Pos: " + i + " - Valor: " + vet[i]);
            }
        }
    }
}
