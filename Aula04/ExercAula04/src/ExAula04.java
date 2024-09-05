public class ExAula04 {

    public static void ex05() {
        /*
         * Elabore um programa que leia 5 números do teclado e os armazene em um
         * vetor.Em seguida, leia um número n qualquer e apresente na tela a quantidade
         * de vezesque o número n aparece no vetor
         */
        int[] vet = new int[5];
        int valor;
        int qntd = 0;

        System.out.println("\n***** EXERCICIO 5 *****");
        System.out.println("Informe 5 valores inteiros para compor o vetor: ");

        for (int i = 0; i < vet.length; i++) {

            System.out.print("Valor para a pos de " + i + ": ");
            vet[i] = Console.lerInt();
        }

        System.out.println("\n Vetor registrado!");
        System.out.print("Informe um outro valor inteiro");
        valor = Console.lerInt();

        for (int i = 0; i < vet.length; i++) {

            if (vet[i] == valor) {
                qntd++;
            }
        }
        System.out.println("\n O valor " + valor + " aparece " + qntd + " vezes no vetor");
    }

    public static void ex06() {
        /*
         * Elabore um programa que leia um vetor com 5 notas de um aluno e um outro
         * vetorcom 5 pesos e calcule a média ponderada do aluno.
         */
        float[] notas = new float[5];
        int[] pesos = { 4, 1, 2, 2, 1 };
        float media = 0;

        System.out.println("\n*****EXERCÍCIO 06*****");
        System.out.println("Informe as 5 notas dos alunos: ");

        for (int i = 0; i < pesos.length; i++) {
            System.out.println("Nota: " + (i + 1) + ": ");
            notas[i] = Console.lerFloar();
            media += notas[i] * pesos[i];
        }

        media /= 10;
        System.out.println("\n A média do aluno é : " + media);
    }
}
