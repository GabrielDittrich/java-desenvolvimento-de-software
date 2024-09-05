import exercicio01.ContaCorrente;
import exercicio01.ContaPoupanca;
import exercicio02.Estoque;
import exercicio02.ProdutoAlimenticio;
import exercicio02.ProdutoEletronico;

public class Principal {

    public static void main(String[] args) throws Exception {
        // Exercicio01();
        // Exercicio01_2();
        Exercicio02();
    }

    private static void Exercicio01() {

        // Nova instancia da classe ContaCorrente
        ContaCorrente oc = new ContaCorrente("Luan", 1234, 2500, 500);

        // Exibindo saldo atual do objeto "oc"
        oc.exibirSaldo();

        // Depositando 300 reais
        oc.depositar(300);

        // Tentar realizar saque de 600 reais
        try {
            oc.sacar(600);
        } catch (Exception e) {
            // se exceder o limite disponivel para o saque, a exceção sera lançada:
            System.out.println(e.getMessage());
        }

        // Exibir saldo atual do objeto "cc"
        oc.exibirSaldo();

        // Tentar realizar saque de 5000 reais
        try {
            oc.sacar(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        oc.exibirSaldo();

    }

    private static void Exercicio01_2() {
        ContaPoupanca cp = new ContaPoupanca("Beltrano Souza", 1235, 1000, 2.5f);

        cp.exibirSaldo();
        cp.depositar(300);

        try {
            cp.sacar(3000);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void Exercicio02() {
        ProdutoEletronico pe = new ProdutoEletronico(123, "Nokia", 15, "Smart Phone");

        ProdutoAlimenticio pa = new ProdutoAlimenticio(1356, "Achocolatado", 50, "2024-11-12");

        try {
            pe.adicionarItem(10);// Funciona
            pa.adicionarItem(-2); // Forçando o erro

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        try {
            pe.removerItem(100); // Forçando o erro
            pa.removerItem(10); // Não executa pois teve erro no "try" antes de chegar nessa linha

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
