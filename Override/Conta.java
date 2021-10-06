package Override;

public class Conta {
    private double saldo;
    private int codigo;

    // Crie um método transferência na classe Conta.
    // O método deve receber um valor double e debitar do saldo da conta.

    public void transferencia(double valor) {
        saldo -= valor;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
