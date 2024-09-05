package exemploAbstrato;

public abstract class Veiculo {
    private String placa;

    public Veiculo() {
    }

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {

        return "\nPlaca: " + placa;
    }

    // Metodo abstrato: Escrevemos apenas sua assinatura
    public abstract String acelera();

    public abstract String parar();

}
