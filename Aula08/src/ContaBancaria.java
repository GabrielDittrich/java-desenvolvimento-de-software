public class ContaBancaria {

    private int numeroConta;
    private String titularConta;
    private float saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, String titularConta, float saldo) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    // Metodos proprios
    // Exibir todos os dados da conta diretamente
    public void exibirDadosConta() {
        System.out.println("\nConta N°: " + numeroConta);
        System.out.println("Titular: " + titularConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println();
    }

    public void sacar(float valor) {
        System.out.println("Sacando " + valor + " na conta " + numeroConta);
        saldo -= valor;
        exibirDadosConta();
    }

    public void depositar(float valor) {
        System.out.println("Depositando " + valor + " na conta " + numeroConta);
        saldo += valor;
        exibirDadosConta();
    }
}
