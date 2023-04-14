package exercise.lista.ex21;

public class Livro {
    private String nome;
    private long id;
    public Livro() {
    }

    public Livro(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
