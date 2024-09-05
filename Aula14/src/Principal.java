import java.util.ArrayList;

import exemploAbstrato.Carro;
import exemploAbstrato.Moto;
import exemploInterface.Circulo;
import exemploInterface.Forma;
import exemploInterface.Quadrado;
import exemploInterface.Retangulo;

public class Principal {

    public static void main(String[] args) {

        Carro meuCarro = new Carro("ABC-1234");
        Moto minhaMoto = new Moto("VCA-4321");

        System.out.println("\nCarro: " + meuCarro + "\nMoto: " + minhaMoto);

        System.out.println("\n" + meuCarro.acelera());
        System.out.println(minhaMoto.acelera());

        System.out.println("\n-------------------------------\n");

        // Usando a interface Forma com os implements de quadrado e circulo em vez de
        // chamar em suas classe
        Forma meuQuadrado = new Quadrado(3.5f);
        Forma meuCirculo = new Circulo(1.7f);
        Retangulo meuRetangulo = new Retangulo(3, 4.2f);

        System.out.println(meuQuadrado.desenhar());
        System.out.println(meuCirculo.desenhar());

        System.out.println("Área do quadrado " + meuQuadrado.calcularArea());
        System.out.println("Área do circulo " + meuCirculo.calcularArea());
        System.out.println("Área do retangulo: " + meuRetangulo.calcularArea());

        ArrayList<Forma> listaForma = new ArrayList<>();
        listaForma.add(meuCirculo);
        listaForma.add(meuQuadrado);
        listaForma.add(meuRetangulo);

        System.out.println("\nDesenhando Formas: ");
        for (Forma tempForma : listaForma) {

            System.out.println(tempForma.desenhar());
        }

    }
}
