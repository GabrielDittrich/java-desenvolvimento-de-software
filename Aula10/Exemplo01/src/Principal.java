public class Principal {
    public static void main(String[] args) {
        Jogo j1 = new Jogo("The last of us", "PS3");
        Jogo j2 = new Jogo("League of legends", "Computador");
        Jogo j3 = new Jogo("Stardew Valley", "Computador");
        Jogo j4 = new Jogo("Red Dead Redempition", "PS4 , XBOX");

        Jogo j5 = new Jogo();
        j5.mostrarDadosJogo();
        j5.setTitulo("Teste");

        ListaJogos lista1 = new ListaJogos("Gabriel");
        lista1.adicionarJogo(j1);
        lista1.adicionarJogo(j2);
        lista1.adicionarJogo(j4);

        lista1.mostraTodosJogos();

        ListaJogos lista2 = new ListaJogos("Jason");
        lista2.adicionarJogo(j4);
        lista2.adicionarJogo(j3);

        lista2.mostraTodosJogos();

    }
}
