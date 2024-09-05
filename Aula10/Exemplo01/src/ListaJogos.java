import java.util.ArrayList;
import java.util.List;

public class ListaJogos {

    private String nomeProprietario;
    private List<Jogo> ListaJogos;

    public ListaJogos() {
    }

    public ListaJogos(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;

        ListaJogos = new ArrayList<>();
    }

    public void adicionarJogo(Jogo novoJogo) {
        ListaJogos.add(novoJogo);
        System.out.println("\nO Jogo " + novoJogo.getTitulo() + " foi salvo a lista de: " + nomeProprietario);
    }

    public void mostraTodosJogos() {
        System.out.println("\n Lista de jogos de " + nomeProprietario);
        // percorrer a lista de jogos com um foreach
        for (Jogo jogoAtual : ListaJogos) {

            // Mostrar dados do jogoAtual da lista
            jogoAtual.mostrarDadosJogo();
        }
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

}
