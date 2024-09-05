public class Principal {

    public static void main(String[] args) {
        ex06();
    }

    public static void ex06() {
        Contato c1 = new Contato();

        c1.setNome("Gabriel");
        c1.setTelefone("(41) 99999-7777");

        Contato c2 = new Contato("Jonas", "(41) 95555-8888");

        Contato c3 = new Contato("Carlinho", "S/Número");

        // Instanciando uma Agenda
        Agenda agenda1 = new Agenda();

        // Salvando 3 contatos na agenda
        agenda1.salvarContato(c1);
        agenda1.salvarContato(c2);
        agenda1.salvarContato(c3);
        agenda1.salvarContato(c3);

        // Limpando a agenda
        agenda1.limparAgenda();

        // Cadastrando o mesmo contato 2 vezes
        agenda1.salvarContato(c1);
        agenda1.salvarContato(c1);

        // Procurando belo contato abaixo
        agenda1.BuscarContato("Maria");
        agenda1.BuscarContato("Gabriel");
        agenda1.BuscarContato("Beltrano");
    }

}