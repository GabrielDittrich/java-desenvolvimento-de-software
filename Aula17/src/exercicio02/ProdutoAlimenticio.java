package exercicio02;

public class ProdutoAlimenticio extends Produto {

    private String dataExpiracao;

    public ProdutoAlimenticio(int id, String nomeProduto, int qntde, String dataExpiracao) {
        super(id, nomeProduto, qntde);
        this.dataExpiracao = dataExpiracao;
    }

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    @Override
    public void exibirItem() {
        System.out.println("\nId do produto: " + id);
        System.out.println("Nome do alimento: " + nomeProduto);
        System.out.println("Data de expiração: " + dataExpiracao);
        System.out.println("Quantidade do alimento: " + qntde);
    }
}
