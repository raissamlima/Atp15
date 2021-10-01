package Dia29;

public class CalculoImpostos {
    private double taxaISS = 0.001/100;
    private double taxaIOF = 0.002/100;
    private double taxaIR = 0.005/100; 
    public double valorRecebido = 0.0;

    // Criando método de calcular a taxa ISS

    public double taxaISS(double valor){
        return taxaISS * valorRecebido;
    } 

    // Criando método de Calcular a taxa IOF

    public double taxaIOF(double valor){
        return taxaIOF * valorRecebido;

    }

    // Criando método de Calcular a taxa IR
    public double taxaIR(double valor){
        return taxaIR * valorRecebido;
    }
    }
