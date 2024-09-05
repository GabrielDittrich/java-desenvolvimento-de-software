import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        int op;

        do {
            mostrarMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\nAgenda de Contatos");
        System.out.println("1) Salvar Contato");
        System.out.println("2) Buscar Contato ");
        System.out.println("3) Listar Contato");
        System.out.println("0) Sair");
        System.out.println("Informe uma opção");

    }

    public static void verificarOpcao(int op) {
        switch (op) {
            case 1:// Cadastrar

                System.out.println("\nNovo Contato");

                System.out.println("Codigo: ");
                int codigo = Console.lerInt();

                System.out.println("Nome: ");
                String nome = Console.lerString();

                System.out.println("Email: ");
                String email = Console.lerString();

                Contato c = new Contato(codigo, nome, email);

                try {
                    Agenda.salvarContato(c);
                    System.out.println("\nO contato foi salvo com sucesso");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

                break;
            case 2:// Buscar

                System.out.println("\nBuscar Contato");

                System.out.println("Codigo do contato: ");
                int codigo2 = Console.lerInt();

                try {
                    Contato c2 = Agenda.buscarContato(codigo2);
                    System.out.println("Contato localizado: " + c2);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                break;
            case 3:// Listar

                System.out.println("\nContatos Cadastrados");

                try {
                    for (Contato tempContato : Agenda.lerAgenda()) {
                        System.out.println(tempContato);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                break;
            case 0:// Sair

                System.out.println("\nO Sistema foi Finalizado");

                break;
            default:
                System.out.println("Opção invalida. \nDigite Novamente: ");
                break;
        }
    }
}
