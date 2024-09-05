public class Reptil extends Animal {

    private String corEscama;
    private String rabo;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getRabo() {
        return rabo;
    }

    public void setRabo(String rabo) {
        this.rabo = rabo;
    }

    public Reptil(String corEscama, String rabo) {
        this.corEscama = corEscama;
        this.rabo = rabo;
    }

    public Reptil(int id, String especie, String comida, int patas, String corEscama, String rabo) {
        super(id, especie, comida, patas);
        this.corEscama = corEscama;
        this.rabo = rabo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCor das escamas: " + corEscama + "\nO rabo se regenera: " + rabo;
    }

}
