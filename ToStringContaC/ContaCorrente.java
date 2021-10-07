package ToStringContaC;

public class ContaCorrente {
    private double saldo;
    private double taxa_saque =10.0;
    private int codigo_cliente;

    public ContaCorrente(double saldo, double taxa_saque, int codigo_cliente){
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }

    public double saque (double saque){
        this.saldo = saque + taxa_saque;
        return this.saldo;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }
    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    @Override
    public String toString(){
        String objetoEmString = this.saldo + " " + this.taxa_saque + " " + this.codigo_cliente;
        return objetoEmString;
}
