package Dia29;

public class CalculadoraTaxas {
    public double valorTaxa = 0.001/100;
    public double valorTaxaSaque = 1.30;
    private int saquesRealizados = 0;
    public double totalValorCobradoTransferencia = 0;
    public double totalValorCobradoSaque = 0;

    // criando o primeiro método de cálculo de taxas nas transferências

    public void transferencia(double valor) {
        double taxa = multiplicar(valor, valorTaxa);
        totalValorCobradoTransferencia += taxa;
    }

    // criando o segundo método de cálculo de taxas em saques

    public void saque(double valor) {
        double taxa = 0;
        saquesRealizados += 1;
        if (saquesRealizados == 5) {
            saquesRealizados = 0;
            taxa = valorTaxaSaque;
        }
        totalValorCobradoSaque += taxa;
    }

    // criando método para multiplicar o valor transferido pelo valor da taxa 

    public double multiplicar(double valorTransferido, double valorTaxa) {
        return valorTransferido * valorTaxa;
    }
}
