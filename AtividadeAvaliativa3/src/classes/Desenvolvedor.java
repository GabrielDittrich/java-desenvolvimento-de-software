package classes;

import Interface.interfaceTrabalhavel;

public class Desenvolvedor extends Funcionario implements interfaceTrabalhavel {
    private String tecnologias;

 

    public Desenvolvedor(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public Desenvolvedor(String nome, int matricula, int horasTrabalho, String tecnologias) {
        super(nome, matricula, horasTrabalho);
        this.tecnologias = tecnologias;
    }

    @Override
    public float calcularSalario() {
        return getHorasTrabalho() * 10;
    }

   @Override
   public String trabalhar() {
       return "\nTrabalho: Mais um dia de trabalho... zzzz";
   }

   @Override
   public String relatarProgresso() {
       return "\nProgresso: Está com um bom desempenho mais podia melhoras";
   }

   @Override
   public String toString() {
       return super.toString() + "\nTecnologias: " + tecnologias;
   }
}