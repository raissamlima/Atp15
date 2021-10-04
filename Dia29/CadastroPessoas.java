package Dia29;

public class CadastroPessoas {
    public static void main(String[] args) {
        PessoaFisica p_f[] = new PessoaFisica[5];

        PessoaFisica p1 = new PessoaFisica();
        p1.setCodigo(26565);
        p1.setNome("Raissa");
        p1.setSobrenome("Lima");
        p1.setIdade(28);
        p1.setRg("65656365");
        p1.setCpf("48348348384");

        PessoaFisica p2 = new PessoaFisica();
        p2.setCodigo(43434);
        p2.setNome("Quezia");
        p2.setSobrenome("Martins");
        p2.setIdade(51);
        p2.setRg("565365");
        p2.setCpf("545453453");

        PessoaFisica p3 = new PessoaFisica();
        p3.setCodigo(65222);
        p3.setNome("Karolina");
        p3.setSobrenome("Eugenio");
        p3.setIdade(33);
        p3.setRg("666233");
        p3.setCpf("5532535");

        PessoaFisica p4 = new PessoaFisica();
        p4.setCodigo(64342);
        p4.setNome("Bruno");
        p4.setSobrenome("Martins");
        p4.setIdade(29);
        p4.setRg("767334");
        p4.setCpf("344344");

        PessoaFisica p5= new PessoaFisica();
        p5.setCodigo(64342);
        p5.setNome("Moacir");
        p5.setSobrenome("Lima");
        p5.setIdade(61);
        p5.setRg("765654");
        p5.setCpf("3445665");
    }
}
