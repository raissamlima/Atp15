package Dia29;

public class TelaPrincipalBanco {
    public static void main(String[] args) {
        ContaCorrente CC = new ContaCorrente();

        CC.setAgencia(45);
        int a = CC.getAgencia();
        System.out.println(a);

        CC.setNumero(32);
        int n = CC.getNumero();
        System.out.println(n);
        
        CC.setCodigo_cliente(3287);
        int c_c = CC.getCodigo_cliente();
        System.out.print(c_c);

        CC.setSaldo(888.87);
        double s = CC.getSaldo();
        System.out.printf("\nO seu saldo total é: %.1f", s);
    }   
}
