package controller;

public class CalcularSalario {

    public static float salario(float valorHora, float horaTrab){
        return valorHora * horaTrab;
    }

    public static float salario(float valorHora, float horaTrab, float bonus){
        return (valorHora * horaTrab) + bonus;
    }
    
}