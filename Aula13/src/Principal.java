public class Principal {

    public static void main(String[] args) {

        Heroi heroi1 = new Heroi("Josepher, O Grande", 30, "Barbaro");

        Vilao vilao1 = new Vilao();
        Vilao vilao2 = new Vilao("Skull", 20, 2);

        System.out.println("Heroi 1: \n" + heroi1.toString());
        System.out.println("Vilão 1: \n" + vilao1);
        System.out.println("Vilão 2: \n" + vilao2);
    }

}
