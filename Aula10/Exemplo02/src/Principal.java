public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fusca", "ABC-4321");
        Carro c2 = new Carro("Camaro", "ASX-2345");
        Carro c3 = new Carro("Xevette", "CBA-9876");

        Estacionamento.estacionarCarro(c1);
        Estacionamento.estacionarCarro(c2);
        Estacionamento.estacionarCarro(c3);

        System.out.println("\nEstacionaSystem:");
        Estacionamento.mostarCarrosEstacionados();
        Estacionamento.liberarCarro(c2);

        Estacionamento.mostarCarrosEstacionados();

        Estacionamento.liberarCarro(c1);
        Estacionamento.liberarCarro(c3);

        Estacionamento.mostarCarrosEstacionados();
    }
}
