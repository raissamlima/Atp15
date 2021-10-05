package HerançaDia05;

public class Universidade {
    public static void main(String[] args) {

        Funcionario fc = new Funcionario();
        fc.setNome("Joaquim");
        fc.setSobrenome("Lima");
        fc.setMatricula(3040);
        fc.setSalario (2.000);
        fc.setDepartamento1("Tecnologia da Informação");
        
        Coordenador cord = new Coordenador();
        cord.setSalario(12.000);
        cord.setDepartamento1("Gerencia TI");
        cord.setCurso_coordenado("Sites Responsivos");
        cord.setBonus(300.00);

        Aluno al = new Aluno();
        al.setNome("Joaquim");
        al.setSobrenome("Lima");
        al.setMatricula(3040);
        al.setCurso("JavaScript");
        al.setTurma("Turma A - Noturno");

            // Impressão Funcionario
            System.out.printf("Nome: %s\n", fc.getNome());
            System.out.printf("Sobrenome: %s\n", fc.getSobrenome());
            System.out.printf("Matricula: %s\n", fc.getMatricula());
            System.out.printf("Salário: %.3f\n", fc.getSalario());
            System.out.printf("Departamento: %s\n", fc.getDepartamento1());

            // Impressão Coordenador
            System.out.printf("\nSalário: %.3f\n", cord.getSalario());
            System.out.printf("Departamento: %s\n", cord.getDepartamento1());
            System.out.printf("Curso Coordenado: %s\n", cord.getCurso_coordenado());
            System.out.printf("Bônus: %.2f\n", cord.getBonus());

            // Impressão Aluno
            System.out.printf("\nNome: %s\n", al.getNome());
            System.out.printf("Sobrenome: %s\n", al.getSobrenome());
            System.out.printf("Matricula: %s\n", al.getMatricula());
            System.out.printf("Curso: %s\n", al.getCurso());
            System.out.printf("Turma: %s\n", al.getTurma());
    }
}