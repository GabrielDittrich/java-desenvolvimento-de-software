public class Funcionario extends Pessoa {

    private float valorHora;
    private float horasTrab;
    private float salarioBruto;

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) throws Exception {

        if (valorHora <= 0) {
            throw new Exception("Horas trabalhadas devem ser maiores que zero.");
        }
        this.valorHora = valorHora;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(float horasTrab) throws Exception {
        if (horasTrab <= 0) {
            throw new Exception("Horas trabalhadas devem ser maiores que zero.");
        }
        this.horasTrab = horasTrab;
    }

    public void calcularSalario() {
        salarioBruto = valorHora + horasTrab;
    }
}
