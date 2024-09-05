import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;

        while (true) {

            try /* Tentar executar o codigo */ {
                valor = leitor.nextInt();
                break;

            } catch /* Se o valor for invalido ele executa esse */ (InputMismatchException e) {
                System.out.println("O valor digitado não e do tipo 'int' ");
                System.out.println("Digite novamente: ");
            } finally /* Sempre vai executar msm no try e no catch */ {
                leitor.nextLine(); // limpeza de buffer
            }
        }
        return valor;
    }

    public static float lerFloat() {
        float valor = 0;

        while (true) {
            try /* Tentar executar o codigo */ {
                valor = leitor.nextFloat();
                break;

            } catch (InputMismatchException e) {
                System.out.println("O valor digitado não e do tipo 'int' ");
                System.out.println("Digite novamente: ");
            } finally {
                leitor.nextLine(); // limpeza de buffer
            }
        }
        return valor;
    }

    public static String lerString() {
        return leitor.nextLine();
    }

}