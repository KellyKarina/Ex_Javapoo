package escola;

public class Aluno extends Pessoa {
    private double numeroMatricula;
    private String serie;

    void realizarAvaliacao() {
        System.out.println("realizando avaliacao");
    }

    public double getnumeroMatricula() {
        return numeroMatricula;
    }

    public void setnumeroMatricula(double numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getserie() {
        return serie;
    }

    public void setserie(String serie) {
        this.serie = serie;
    }

    @Override
    void status() {
        System.out.println("aluno: " + getnome());
        System.out.println("idade: " + getidade());
        System.out.println("numero da matricula: " + numeroMatricula);
        System.out.println("serie: " + serie);
    }

}
