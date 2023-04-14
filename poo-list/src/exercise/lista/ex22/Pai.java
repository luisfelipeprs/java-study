package exercise.lista.ex22;

public class Pai extends Pessoa{
    private int idade = 40;
    private String nome = "Poggers";

    public Pai() {
    }

    public Pai(int idade, String nome) {
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
        return "Pai{" +
                "Nome='" + nome + "'" +" idade=" + idade +
                '}';
    }
}
