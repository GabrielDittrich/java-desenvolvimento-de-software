public class Ave extends Animal {

    private String voa;

    public void setVoa(String voa) {
        this.voa = voa;
    }

    public String getVoa() {
        return voa;
    }

    public Ave(String voa) {
        this.voa = voa;
    }

    public Ave() {
    }

    public Ave(int id, String nome, String comida, int patas, String voa) {
        super(id, nome, comida, patas);
        this.voa = voa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSabe voar: " + voa;
    }
}
