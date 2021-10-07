package ToString;

public class Tela {
    public static void main(String[] args) {

        Aluno a = new Aluno();
        a.setNome_completo("Raissa Martins");
        a.setIdade(27);
        a.setMatricula(1313);

        System.out.printf("Imprimindo o nome completo de %s \n\t%s", a.getNome_completo(),  a);
    }   
}
