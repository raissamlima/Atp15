package Dia29;

public class TelaPrincipal {
    public static void main(String[] args) {
        ProdutoPrincipal PP = new ProdutoPrincipal();
        
        PP.setCodigo(3567);
        int c = PP.getCodigo();
        System.out.println(c);

        PP.setNome("Raissa");
        String n = PP.getNome(); 
        System.out.println(n);

        PP.setDescricao("Produto 02");
        String p = PP.getDescricao();
        System.out.print(p);

        PP.setValor(250.00);
        double v = PP.getValor();
        System.out.printf("\nO valor é: %.2f ", v);
    } 
}
