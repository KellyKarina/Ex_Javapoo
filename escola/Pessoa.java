package escola;

public abstract class Pessoa {
    private String nome;
    private int idade;

    void status() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int getidade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

}
