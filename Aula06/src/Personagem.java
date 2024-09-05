public class Personagem {

    String nome;
    String classe;
     Int atk;
     Int def;
    public Personagem(String nome, String classe, int atk, int def) {
        this.nome = nome;
        this.classe = classe;
        this.atk = atk;
        this.def = def;
        }

        public void copiarPersonagem(Personagem p) {
            this.nome= p.nome;
            this.classe = p.classe;
            this.atk = p.atk;
            this.def = p.def;
        }
        public void mostrarPersonagem() {
            System.out.println("Nome: " +nome);
            System.out.println("Classe " +classe);
            System.out.println("Ataque"  +atk);
            System.out.println("Defesa":  +def);


            

        }
    
}
