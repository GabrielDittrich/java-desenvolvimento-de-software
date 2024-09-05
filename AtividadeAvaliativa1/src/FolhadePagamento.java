public class FolhadePagamento {

    private String nomeFunc;
    private float horasTrab;
    private float valorHora;

    public FolhadePagamento() {

    }

    public FolhadePagamento(String nomeFunc, float horasTrab, float valorHora) {
        this.nomeFunc = nomeFunc;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float salarioBruto(float horasTrab, float valorHora) {
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
        float valor = horasTrab * valorHora;
        return valor;
    }

    public float calcularINSS(float salarioBruto) {
        float inss;
        if (salarioBruto <= 868.29) {
            inss = 0.08f * salarioBruto;
        } else if (salarioBruto <= 1447.14) {
            inss = 0.09f * salarioBruto;
        } else if (salarioBruto <= 2894.27) {
            inss = 0.11f * salarioBruto;
        } else {
            inss = 318.37f;
        }
        return inss;
    }

    public float calcularFGTS(float salarioBruto) {
        return 0.08f * salarioBruto;
    }

    public float calcularIR(float salarioBruto) {
        float ir;
        if (salarioBruto <= 1372.81) {
            ir = 0;
        } else if (salarioBruto <= 2743.25) {
            ir = (salarioBruto * 0.15f) - 205.92f;
        } else {
            ir = (salarioBruto * 0.275f) - 548.82f;
        }
        return ir;
    }
}
