package model;

import controller.CalcularSalario;

public class Gerente extends Funcionario {

    private float bonus;
    private String equipe;

    public Gerente (){

    }

    public Gerente(String nome, int matricula, float valorHora, float horaTrab, float bonus, String equipe) {
        super(nome, matricula, valorHora, horaTrab);
        this.bonus = bonus;
        this.equipe = equipe;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String trabalhar(){
        return "Bom Dia, Bom trabalho a todos";
    }

    public String relatarTrabalho(){
        return "Boa tarde, Como esta o andamento do trabalho? ";
    }

    @Override
    public String toString() {

        return super.toString() + 
        "\nBonificação: " + bonus + 
        "\nEquipe: " + equipe +
        "\nTrabalho: " + trabalhar()+
        "\nRelatorio do Trabalho: " + relatarTrabalho() + 
        "\nSalário: " + CalcularSalario.salario(valorHora, valorHora, bonus);
    }




    
}
