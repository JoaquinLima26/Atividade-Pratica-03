package model;

import controller.CalcularSalario;

public class Funcionario {

private String nome;
private int matricula;
protected float valorHora;
protected float horaTrab;

public Funcionario() {
}

public Funcionario(String nome, int matricula, float valorHora, float horaTrab) {
    this.nome = nome;
    this.matricula = matricula;
    this.valorHora = valorHora;
    this.horaTrab = horaTrab;
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

public float getValorHora() {
    return valorHora;
}

public void setValorHora(float valorHora) {
    this.valorHora = valorHora;
}

public float getHoraTrab() {
    return horaTrab;
}

public void setHoraTrab(float horaTrab) {
    this.horaTrab = horaTrab;
}



public String toString(){

    return "\nNome: " + nome + 
    "\nMatrícula: " + matricula + 
    "\nValor da hora: R$ " + valorHora + 
    "\nHoras Trabalhadas: " + horaTrab + "h" +
    "\nSalário: " + CalcularSalario.salario(valorHora, horaTrab);
}


}