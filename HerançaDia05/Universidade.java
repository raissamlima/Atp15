package HerançaDia05;

public class Universidade {
    public static void main(String[] args) {

        Funcionario fc = new Funcionario();
        fc.setNome("Joaquim");
        fc.setSobrenome("Lima");
        fc.setMatricula(3040);
        fc.setSalario (2.000);
        fc.setDepartamento("Tecnologia da Informação");
        
        Coordenador cord = new Coordenador();
        cord.setSalario(12.000);
        cord.setDepartamento("Gerencia TI");
        cord.setCurso_coordenado("Sites Responsivos");
        cord.setBonus(300.00);

        Aluno al = new Aluno();
        al.setNome("Joaquim");
        al.setSobrenome("Lima");
        al.setMatricula(3040);
        al.setCurso("JavaScript");
        al.setTurma("Turma A - Noturno");
    }
}
