package exercicio01;

public class ContaPoupanca extends ContaBancaria {

    private float taxaLucros;

    public ContaPoupanca(String nomeCliente, int numConta, float saldo, float taxaLucros) {
        super(nomeCliente, numConta, saldo);
        this.taxaLucros = taxaLucros;
    }

    public float getTaxaLucros() {
        return taxaLucros;
    }

    public void setTaxaLucros(float taxaLucros) {
        this.taxaLucros = taxaLucros;
    }

    @Override
    public void sacar(float valor) throws Exception {

        if (valor > saldo) {
            throw new Exception("\nO valor do saque não pode ser superior ao saldo: " + saldo);
        }

    }

    @Override
    public void exibirSaldo() {

        System.out.println("\nConta corrente numero: " + numConta);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo atual R$ " + saldo);
        System.out.println("Taxa de juros ao mês: " + taxaLucros);
        System.out.println("Rendimento previsto para o mês: R$ " + (saldo + (taxaLucros / 100)));
    }

}
