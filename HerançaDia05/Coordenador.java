package HerançaDia05;

public class Coordenador extends Funcionario {
    private String curso_coordenado;
    private double bonus;

    public String getCurso_coordenado() {
        return curso_coordenado;
    }
    public void setCurso_coordenado(String curso_coordenado) {
        this.curso_coordenado = curso_coordenado;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
