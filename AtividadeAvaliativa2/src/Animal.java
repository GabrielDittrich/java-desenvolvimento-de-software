public class Animal {
    private int id;
    private String nome;
    private String comida;
    private int patas;

    public Animal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal(int id, String especie, String comida, int patas) {
        this.id = id;
        this.nome = especie;
        this.comida = comida;
        this.patas = patas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String especie) {
        this.nome = especie;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "\nAnimal " + "\nNome: " + nome + "\nComida: " + comida + "\nPatas: " + patas;
    }
}
