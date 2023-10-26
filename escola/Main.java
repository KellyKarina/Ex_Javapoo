package escola;

public class Main {
    public static void main (String[] args){

        Aluno a1 = new Aluno();
        a1.setnome("julio");
        a1.setidade(15);
        a1.setnumeroMatricula(123.456);
        a1.setserie("primeiro ano");
        a1.realizarAvaliacao();
        a1.status();

        System.out.println("-----------------------");
        System.out.println("-----------------------");

        Professor p1 = new Professor();
        p1.setnome("maju");
        p1.setidade(49);
        p1.setcursoMinistrado("Geografia");
        p1.setsalario(3.399);
        p1.aplicarAvaliacao();
        p1.status();

    }
}
