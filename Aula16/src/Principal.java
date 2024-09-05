public class Principal {
    public static void main(String[] args) throws Exception {
        // exemplo1();
        // exemplo2();
        exemplo3();
    }

    private static void exemplo1() {
        System.out.println("Informe o valor inteiro: ");
        int valor = Console.lerInt();

        System.out.println("Informe outro valor inteiro: ");
        int valor2 = Console.lerInt();

        try {
            int result = Calculadora.somarPositivos(valor, valor2);
            System.out.println("Soma dos valores inteiros: " + result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("O programa foi finalizado...");
        }
    }

    private static void exemplo2() {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        // tente
        try {
            p1.setNome("João");
            p2.setNome("Maria");

            System.out.println("Nome: " + p1.getNome());
            System.out.println("Nome: " + p2.getNome());

        } catch (NullPointerException e) { // Se valor for nulo

            System.out.println("Não é possivel editar o nome do objeto p2, pois ele é nulo");
        }
    }

    private static void exemplo3() {
        Funcionario func = new Funcionario();

        System.out.println("Nome do funcionario: ");
        String nome = Console.lerString();
        func.setNome(nome);

        float valorHora = 0;

        while (true) {
            try {
                valorHora = Console.lerFloat();
                func.setValorHora(valorHora);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        float horasTrab = 0;
        while (true) {
            try {
                horasTrab = Console.lerFloat();
                func.setHorasTrab(horasTrab);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        func.calcularSalario();
        System.out.println("O salario do funcionario " + func.getNome() + " É R$ " + func.getSalarioBruto());
    }
}
