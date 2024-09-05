public class Aula05 {
    public static void main(String[] args) {

        // Declaração de novo objeto Aluno.
        Aluno a1 = new Aluno();

        // Armazenar dados no a1:
        a1.nome = "Gabriel Dittrich";
        a1.curso = "ADS";
        a1.turno = "Manhã";
        a1.campus = "Osório";

        System.out.println("\n****** Dados do Alunos A1 ******");
        System.out.println("Nome : " + a1.nome +
                "\nCurso: " + a1.curso +
                "\nCamputs: " + a1.campus +
                "\nTurno: " + a1.turno);

        // Criando Segundo Aluno:
        Aluno a2 = new Aluno();

        System.out.println("\n Cadastro do Aluno A2: ");

        System.out.print("Informe o nome do aluno: ");
        a2.nome = Console.lerString();
        System.out.print("Curso :");
        a2.curso = Console.lerString();
        System.out.print("Turno: ");
        a2.turno = Console.lerString();
        System.out.print("Campus: ");
        a2.campus = Console.lerString();

        System.out.println("\n ***** Dados do Aluno A2 *****");
        System.out.println(a2.toString());

        // Instanciando o Aluno A3
        Aluno a3 = new Aluno("Gabriel", "ADS", "Manhã", "Osório");
        System.out.println("\n****** Dados do Aluno A3 ******");
        System.out.println(a3.toString());
    }
}