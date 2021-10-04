package Dia29;

public class ContaCorrente {
    
    // Criando as variáveis da Conta Corrente, todas privadas

    private int agencia;
    private int numero;
    private int codigo_cliente;
    private double saldo;

    // Criando o método GET e SET

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public int getAgencia(){
        return this.agencia;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }

    public void setCodigo_cliente(int codigo_cliente){
        this.codigo_cliente = codigo_cliente;
    }
    public int getCodigo_cliente(){
        return this.codigo_cliente;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
