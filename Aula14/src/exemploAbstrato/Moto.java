package exemploAbstrato;

public class Moto extends Veiculo {

    public Moto() {
    }

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public String acelera() {
        return "Moto acelerou! Ran-dandandan!";
    }

    @Override
    public String parar() {
        return "Moto parou! STOPIS!";
    }

    @Override
    public String toString() {
        return getClass() + super.toString();
    }
}
