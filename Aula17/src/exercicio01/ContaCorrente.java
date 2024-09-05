package exercicio01;

public class ContaCorrente extends ContaBancaria {

    private float chequeEspecial;

    public ContaCorrente(String nomeCliente, int numConta, float saldo) {
        super(nomeCliente, numConta, saldo);
        // TODO Auto-generated constructor stub
    }

    public ContaCorrente(String nomeCliente, int numConta, float saldo, float chequeEspecial) {
        super(nomeCliente, numConta, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void sacar(float valor) throws Exception {

        if (valor > (saldo + chequeEspecial)) {
            throw new Exception("\nO valor do saque é superior ao limite disponivel");
        }
        saldo -= valor;
        System.out.println("\nO valor R$ " + valor + " foi sacado da conta " + numConta);

    }

    @Override
    public void exibirSaldo() {
        System.out.println("\nConta corrente numero: " + numConta);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo atual R$ " + saldo);
        System.out.println("Cheque especial: " + chequeEspecial);
        System.out.println("Total disponiuvel: " + (saldo + chequeEspecial));
    }

}
