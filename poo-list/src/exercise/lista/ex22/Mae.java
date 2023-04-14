package exercise.lista.ex22;

public class Mae extends Pessoa{
    private int idade = 32;
    private String nome = "Noggers";

    public Mae() {
    }

    public Mae(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Mae{" +
                "Nome='" + nome+"'"+
                ", idade=" + idade +
                '}';
    }
}
