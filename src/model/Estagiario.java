package model;

import controller.CalcularSalario;


public class Estagiario extends Funcionario {

   private String supervisor;

   public Estagiario (){

   }

    public Estagiario(String nome, int matricula, float valorHora, float horaTrab, String supervisor) {
    super(nome, matricula, valorHora, horaTrab);
    this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    
    public String trabalhar(){
        return "Bom Dia, vou começar os trabalhos, Alguem precisa de algo?";
    }

    public String relatarTrabalho(){
        return "Boa tarde, estamos em 90% do projeto desse mês";
    }

   @Override
   public String toString() {

       return super.toString() + 
       "\nSupervisor: " + supervisor +
       "\nTrabalho: " + trabalhar()+
       "\nRelatorio do Trabalho: " + relatarTrabalho() +  
       "\nSalário: " + CalcularSalario.salario(valorHora, horaTrab);
   }
}

