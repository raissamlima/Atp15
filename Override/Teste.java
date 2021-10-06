package Override;

public class Teste {
    public static void main(String[] args) {

        Conta c = new Conta();
        
        c.setCodigo(2344);
        System.out.printf("\nSeu código é: %s", c.getCodigo());

        c.setSaldo(48000.00);
        System.out.printf("\nSeu saldo é: %.3f", c.getSaldo());

        c.transferencia(250);
        c.transferencia(320);
        c.transferencia(450);
        c.transferencia(30);
        c.transferencia(20);
        
        System.out.printf("\nSeu saldo após a transferência é: %.3f\n", c.getSaldo());

        ContaCorrente cc = new ContaCorrente();

        cc.setCodigo(3566);
        System.out.printf("\nSeu código é: %s", cc.getCodigo());

        cc.setSaldo(25000.00);
        System.out.printf("\nSeu saldo é: %.3f", cc.getSaldo());

        cc.transferencia(800);
        cc.transferencia(20);
        cc.transferencia(46);
        cc.transferencia(25);
        cc.transferencia(20);
        System.out.printf("\nSeu saldo após a transferência é: %.3f", cc.getSaldo());       
    }
}
