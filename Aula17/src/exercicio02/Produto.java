package exercicio02;

public abstract class Produto implements Estoque {

    protected int id;
    protected String nomeProduto;
    protected int qntde;

    public Produto(int id, String nomeProduto, int qntde) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.qntde = qntde;
    }

    @Override
    public void adicionarItem(int qtde) throws Exception {

        if (qtde <= 0) {
            throw new Exception("\nQuantidade deve ser maior que zero");
        }
        this.qntde += qntde;

        System.out.println(qtde + " adicionado(s) ao estoque de " + nomeProduto);

    }

    @Override
    public void removerItem(int qtde) throws Exception {
        if (qtde > this.qntde) {
            throw new Exception("\nQuantidade não pode ser maior que " + this.qntde);
        }

        this.qntde -= qtde;
        System.out.println(qtde + " removido(s) do estoque de " + nomeProduto);
    }

    public abstract void exibirItem();

}
