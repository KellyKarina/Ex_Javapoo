package escola;

public class Professor extends Pessoa {
    private String cursoMinistrado;
    private double salario;

    void aplicarAvaliacao() {
        System.out.println("aplicando avaliacao");
    }

    public String getcursoMinistrado() {
        return cursoMinistrado;
    }

    public void setcursoMinistrado(String cursoMinistrado) {
        this.cursoMinistrado = cursoMinistrado;
    }

    public double getsalario() {
        return salario;
    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    void status() {
        System.out.println("professora: " + getnome());
        System.out.println("idade: " + getidade());
        System.out.println("curso ministrado: " + getcursoMinistrado());
        System.out.println("salario: " + salario);
    }

}
