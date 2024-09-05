package exercicio02;

public class ProdutoEletronico extends Produto {

    private String categoria;

    public ProdutoEletronico(int id, String nomeProduto, int qntde, String categoria) {
        super(id, nomeProduto, qntde);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void exibirItem() {
        System.out.println("\nId do produto: " + id);
        System.out.println("Categoria do eletronico: " + categoria);
        System.out.println("Nome do eletronico: " + nomeProduto);
        System.out.println("Quantidade em estoque: " + qntde);
    }

}
