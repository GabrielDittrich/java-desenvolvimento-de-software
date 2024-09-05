package classes;

import Interface.interfaceTrabalhavel;

public class Gerente extends Funcionario implements interfaceTrabalhavel {
    private float bonusAnual;
    private String equipe;

  
    public Gerente(float bonusAnual, String equipe) {
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
    }

    public Gerente(String nome, int matricula, int horasTrabalho, float bonusAnual, String equipe) {
        super(nome, matricula, horasTrabalho);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
    }

    @Override
    public float calcularSalario() {
        return (getHorasTrabalho() * 10) * bonusAnual;
    }

  @Override
  public String trabalhar() {
  
      return "Trabalho: Estou ocupado com minha agenda";
  }

   @Override
   public String relatarProgresso() {
       return "Progresso: Continuem trabalhando duro assim que final do mês eu troco meu corsinha";
   }

   @Override
   public String toString() {
       return super.toString() + "\nBonus Anual: " +  bonusAnual + "\nEquipe: " + equipe;
   }
}