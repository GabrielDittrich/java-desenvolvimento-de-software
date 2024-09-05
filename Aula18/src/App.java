public class App {
    public static void main(String[] args) throws Exception {
        salvarJogos();
        lerJogosDeArquivo();
        lerJogosDoArrayList();
    }

    private static void salvarJogos() {

        Jogo jogo1 = new Jogo(1, "The Last of Us", "Acao/Aventura");
        Jogo jogo2 = new Jogo(2, "Super Mario World", "Plataforma");
        Jogo jogo3 = new Jogo(3, "The Sims 4", "Simulacao");

        GerenciadorJogo.salvarJogo(jogo1);
        GerenciadorJogo.salvarJogo(jogo2);
        GerenciadorJogo.salvarJogo(jogo3);

        System.out.println("3 Jogos foram salvos no arquivo 'jogos.txt'");
    }

    private static void lerJogosDeArquivo() {
        System.out.println("\nJogos Cadastrados: ");

        try {
            GerenciadorJogo.lerJogos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void lerJogosDoArrayList() {
        try {
            for (Jogo tempJogo : GerenciadorJogo.getListaJogos()) {
                System.out.println(tempJogo);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
