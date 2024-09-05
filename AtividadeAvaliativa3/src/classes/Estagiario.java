package classes;

import Interface.interfaceTrabalhavel;

public class Estagiario extends Funcionario implements interfaceTrabalhavel {
    private String supervisor;

    

    public Estagiario(String supervisor) {
        this.supervisor = supervisor;
    }

    public Estagiario(String nome, int matricula, int horasTrabalho, String supervisor) {
        super(nome, matricula, horasTrabalho);
        this.supervisor = supervisor;
    }

    @Override
    public float calcularSalario() {
        return 8 * getHorasTrabalho(); 
    }

 @Override
 public String trabalhar() {
     return "\nTrabalho: Trabalhando Duro para subir na empresa e ficar rico";
 }
   @Override
   public String relatarProgresso() {
       return "\nProgresso: Estagiario dedicado, tem futuro promissor na empressa";
   }
   
   @Override
   public String toString() {
       return super.toString() + "\nSupervisor: " + supervisor;
   }
}