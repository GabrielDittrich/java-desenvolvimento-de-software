public class Principal {

    public static void exPessoa() {
        Pessoa p1 = new Pessoa();
        p1.nome = "José";
        p1.idade = 45;

        System.out.println("Pessoa p1: ");
        System.out.println(p1.nome);
        System.out.println(p1.idade);

        Pessoa p2 = new Pessoa("fulano", "30");
        System.out.println("Pessoa p2: ");
        System.out.println(p1.nome);
        System.out.println(p1.idade);
        Pessoa p3 = new Pessoa();
        p3 = p2;
        p2.nome = "Ciclano";
        p3.nome = "Abc";
        System.out.println("Nome de p2: " + p2.nome);
        System.out.println("Nome de p3: " + p3.nome);

        // Nova instância de Pessoa, com os mesmos dados de p1:
        Pessoa p4 = new Pessoa(p1.nome, p1.idade);
        p4.idade = 25;
        System.out.println("Pessoa p4:");
        System.out.println(p4.nome);
        System.out.println(p4.idade);
        // alterar nome de p4
        p4.nome = "Antonio";
        System.out.println("Nome de p1" + p1.nome);
        System.out.println("Nome de p4" + p4.nome);
    }
    public static void Personagem() {
        Personagem p1= new Personagem("Presto","ladrão",80,45);
    }

}
