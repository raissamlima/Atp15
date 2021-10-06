package Override;

public class ContaCorrente extends Conta {
    private double taxa_transferencia = 10.50;
    private double taxa_manutencao = 2.50;
    private int numero_transferencias = 0;

    @Override
    public void transferencia(double valor) {
        super.transferencia(valor);
        double novo_saldo = this.getSaldo() - taxa_transferencia;
        this.setSaldo(novo_saldo);

        numero_transferencias += 1;
        if (numero_transferencias == 5) {
            numero_transferencias = 0;
            // numero_transferencias ++;

            novo_saldo = this.getSaldo() - taxa_manutencao;
            this.setSaldo(novo_saldo);
        }
    }
}
