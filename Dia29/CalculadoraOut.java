package Dia29;

public class CalculadoraOut {
    public static void main(String[] args) {
        CalculoImpostos calculadora = new CalculoImpostos();

        // ISS

        double iss = calculadora.ISS(35.000);
        System.out.printf("O valor de impostos calculados foi: %.4f", iss);

        // IOF

        double iof = calculadora.IOF(60.000);
        System.out.printf("\nO valor de impostos calculados foi: %.4f", iof);

        // IR

        double ir = calculadora.IR(10.000);
        System.out.printf("\nO valor de impostos calculados foi: %.4f", ir);

    }
}
