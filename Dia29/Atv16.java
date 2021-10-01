package Dia29;

public class Atv16 {
    public static void main(String[] args) {
        CalculadoraTaxas calculadora = new CalculadoraTaxas();
     
    // Duas transferências realizadas

        calculadora.transferencia(1000.80);
        calculadora.transferencia(100.50);
    
    // Cinco saques realizados que irão imprimir a taxa de 1,30 reais

        calculadora.saque(250.00);
        calculadora.saque(310.00);
        calculadora.saque(800.00);
        calculadora.saque(300.00);
        calculadora.saque(240.00);

        imprimir(calculadora);
    }

    // Criando método para imprimir

    static public void imprimir(CalculadoraTaxas calculadora){
        System.out.printf("O total de taxas de transferência realizado foi: %.2f", calculadora.totalValorCobradoTransferencia);
        System.out.printf("\nO total de saques realizados foi: %.2f", calculadora.totalValorCobradoSaque);
    }
}
