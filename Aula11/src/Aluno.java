public class Aluno extends Pessoa {
    private String rgm;

    public Aluno() {
    }

    public Aluno(String nome, String email, String rgm) {
        super(nome, email);
        this.rgm = rgm;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    @Override
    public String toString() {

        // String txt = "Nome: " + super.getNome() + "\nE-mail: " + super.getEmail() +
        // "\nRgm: " + rgm;
        String txt = super.toString() + "\nRgm: " + rgm;
        return txt;
    }
}
