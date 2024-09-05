public class Principal {
    public static void main(String[] args) {

        int menu;

        do {
            System.out.println(" ***** MENU ***** ");
            System.out.println(" 1 - Calcular folha de pagamento.");
            System.out.println(" 2 - Sair do programa.");

            menu = Console.lerInt();

            switch (menu) {
                case 1:

                    FolhadePagamento f1 = new FolhadePagamento();

                    System.out.println("Nome do Funcionario: ");
                    f1.setNomeFunc(Console.lerString());

                    System.out.println("Horas trabalhadas: ");
                    f1.setHorasTrab(Console.lerFloat());

                    System.out.println("Valor das horas: ");
                    f1.setValorHora(Console.lerFloat());

                    System.out.println("Horas trabalhadas e valor das horas: ");
                    System.out.println("Bruto: " + f1.salarioBruto(f1.getHorasTrab(), f1.getValorHora()));

                    System.out.println("IR: " + f1.calcularIR(f1.salarioBruto(f1.getHorasTrab(), f1.getValorHora())));

                    System.out
                            .println("INSS: " + f1.calcularINSS(f1.salarioBruto(f1.getHorasTrab(), f1.getValorHora())));

                    System.out
                            .println("FGTS: " + f1.calcularFGTS(f1.salarioBruto(f1.getHorasTrab(), f1.getValorHora())));
                    break;

                case 2:
                    System.out.println("Tchauzinho!!");
                default:
                    break;
            }
        } while (menu != 2);
    }

}
