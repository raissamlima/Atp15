package Dia29;

public class CalculoImpostos {
    private double taxaISS = 0.0030 / 100;
    private double taxaIOF = 0.002 / 100;
    private double taxaIR = 0.005 / 100;

    // ISS

    public double ISS(double valor) {

        double totalValorISS = taxaISS * valor;
        return totalValorISS;
    }

    // Criando método de Calcular a taxa IOF

    public double IOF(double valor) {

        double totalValorIOF = taxaIOF * valor;
        return totalValorIOF;
    }

    // Criando método de Calcular a taxa IR

    public double IR(double valor) {

        double totalValorIR = taxaIR * valor;
        return totalValorIR;
    }
}
