package exemploAbstrato;

public class Carro extends Veiculo {

    public Carro() {

    }

    public Carro(String placa) {
        super(placa);
    }

    @Override
    public String acelera() {
        return "Carro acelerou! Vrummm!";
    }

    @Override
    public String parar() {
        return "Carro parou! STOP!";
    }

    @Override
    public String toString() {
        return getClass() + super.toString();
    }
}
