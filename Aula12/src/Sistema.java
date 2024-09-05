public class Sistema {

    private static String nomeDoProjeto;

    private static void exibirMenu() {
        System.out.println("\nFUNCIONARIO_SYSTEM");
        System.out.println("1) Cadastrar Programador");
        System.out.println("2) Cadastrar Gerente");
        System.out.println("3) Procurar Funcionario");
        System.out.println("4) Listar Todos");
        System.out.println("5) Sair");
        System.out.println("\nDigite a opção: ");
    }

    private static void verificarOpcao(int op) {

        int matricula;
        String nome;
        String linguaguem;
        String nomeProjeto;

        switch (op) {
            case 1:

                System.out.println("\nnovo Programador:");
                System.out.println("Matricula");
                matricula = Console.lerInt();

                System.out.println("Nome");
                nome = Console.lerString();

                System.out.println("Linguagem que domina: ");
                linguaguem = Console.lerString();

                Programador p = new Programador(matricula, nome, linguaguem);

                Cadastro.cadastrar(p);

                System.out.println("\nProgramador cadastro com sucesso");

                break;

            case 2:

                System.out.println("\nNovo Gerente:");
                System.out.println("Matricula");
                matricula = Console.lerInt();

                System.out.println("Nome");
                nome = Console.lerString();

                System.out.println("Nome do gerente: ");
                linguaguem = Console.lerString();

                Gerente g = new Gerente(matricula, nome, nomeDoProjeto);

                Cadastro.cadastrar(g);

                System.out.println("\nGerente cadastrado com sucesso");

                break;

            case 3:

                System.out.println("\nProcurar Funcionario:");

                System.out.println("Matricula");
                matricula = Console.lerInt();

                Funcionario f = Cadastro.buscar(matricula);
                if (f != null) {

                    System.out.println("\nFuncionario Localizado");
                    System.out.println(f.toString());

                } else {

                    System.out.println("\nfuncionario: " + matricula + "nao foi encontrado");
                }

                break;

            case 4:

                System.out.println("\nlistar todos os funcionarios cadastrados: ");

                if (Cadastro.GetListaFuncionarios().size() == 0) {
                    System.out.println("Sem registros!");
                    return;
                }

                for (Funcionario temp : Cadastro.GetListaFuncionarios())
                    System.out.println(temp.toString());

                break;

            case 0:

                System.out.println("\nPrograma foi finalizado");

                break;

            default:

                System.out.println("\nOpção invalida. Digite novamente");

                break;
        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = EntradaDados.leInt();
            verificarOpcao(op);
        } while (op != 0);
    }
}
