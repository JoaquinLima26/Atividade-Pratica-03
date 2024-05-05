package model;

import controller.CalcularSalario;

public class Desenvolvedor extends Funcionario {
    
    private String tecnologias;

    public Desenvolvedor(){

    }

    public Desenvolvedor(String nome, int matricula, float valorHora, float horaTrab, String tecnologias) {
        super(nome, matricula, valorHora, horaTrab);
        this.tecnologias = tecnologias;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String trabalhar(){
        return "Bom Dia, vou começar os trabalhos";
    }

    public String relatarTrabalho(){
        return "Boa tarde, estamos em 90% do projeto desse mês";
    }

    @Override
    public String toString() {
    
        return super.toString() + 
        "\nTecnolohgias: " + tecnologias +
        "\nTrabalho: " + trabalhar()+
        "\nRelatorio do Trabalho: " + relatarTrabalho() + 
        "\nSalário: " + CalcularSalario.salario(valorHora,horaTrab);
    }

}
