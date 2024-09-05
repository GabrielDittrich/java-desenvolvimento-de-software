package classes;

public abstract class Funcionario {
    protected String nome;
    protected int matricula;
    private int horasTrabalho;

    public Funcionario(){}

 

    public Funcionario(String nome, int matricula, int horasTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.horasTrabalho = horasTrabalho;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public abstract float calcularSalario();

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nMatricula: " + matricula + "\nHoras Trabalhadas: " + horasTrabalho;
    }



    public int getHorasTrabalho() {
        return horasTrabalho;
    }



    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }
    
}

