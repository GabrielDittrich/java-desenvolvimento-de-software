import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private static List<Carro> listaCarro = new ArrayList<>();

    public static void estacionarCarro(Carro carro) {
        listaCarro.add(carro);
        System.out.println("Carro: " + carro.getModelo() + " está estacionado");
    }

    public static void mostarCarrosEstacionados() {

        if (listaCarro.size() == 0) {
            System.out.println("\nNão há carros estacionados");
            return;
        }

        System.out.println("\nCarro Estacionado");

        for (Carro carroTemp : listaCarro) {
            carroTemp.mostrarDadosCarro();

        }
    }

    public static void liberarCarro(Carro carro) {
        listaCarro.remove(carro);
        System.out.println("\nCarro " + carro.getModelo() + " ( " + carro.getPlaca() + " ) foi liberado");
    }
}
