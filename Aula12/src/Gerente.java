public class Gerente extends Funcionario{

   //public void apresentacao() {
    //System.out.println("Eu sou o gerente " + this.getNome());
    
    public String nomeDoProjeto;

    public String getNomeDoProjeto() {
        return nomeDoProjeto;
    }

    public void setNomeDoProjeto(String nomeDoProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public Gerente(String nomeDoProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public Gerente(int matricula, String nome, String nomeDoProjeto) {
        super(matricula, nome);
        this.nomeDoProjeto = nomeDoProjeto;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nNome do projeto: " + nomeDoProjeto;
    }

 }
                                                                       

