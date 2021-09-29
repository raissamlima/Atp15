package Dia29;

class Atv15 {
    public static void main(String[] args) { 
        Pessoa p1 = new Pessoa();
        p1.nome = "Raissa";
        p1.sobrenome = "Martins";
        p1.idade = 28;

        Pessoa p2 = new Pessoa();
        p2.nome = "Karolina";
        p2.sobrenome = "Franca";
        p2.idade = 32;

        imprimir(p1);
        imprimir(p2);
    }
    static void imprimir(Pessoa p) {
        System.out.printf(p.nome);
        System.out.println(p.sobrenome);
        System.out.println(p.idade);
    }
}