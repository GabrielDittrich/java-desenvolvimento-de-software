public class Jogador {

    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador() {
    }

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    // Exibir os dados do jogador
    public void exibirStausJogador() {
        System.out.println("\nJogador: " + nome);
        System.out.println("Pontuação atual: " + pontuacao);
        System.out.println("Nivel atual: " + nivel);
    }

    public void aumentarPontuacao(int valor) {
        System.out.println("Pontos adicionados: " + valor + " para " + nome);
        pontuacao += valor;
        exibirStausJogador();
    }

    public void subirNivel() {
        System.out.println(nome + "subiu de nivel!");
        nivel++;
        exibirStausJogador();
    }

}
