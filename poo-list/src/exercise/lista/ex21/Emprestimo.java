package exercise.lista.ex21;

import exercise.lista.ex19.Produto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprestimo {
    private Date dataEmprestimo;
    private Date dataDevolucao;

    private List<Livro> livros = new ArrayList<>();
    private Pessoa pessoa = null;

    public Emprestimo(Date dataEmprestimo, List<Livro> livros, Pessoa pessoa) {
        this.dataEmprestimo = dataEmprestimo;
        this.livros = livros;
        this.pessoa = pessoa;
    }

    public Emprestimo() {
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void addLivro(Livro livro){
        livros.add(livro);
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", livros=" + livros +
                ", pessoa=" + pessoa +
                '}';
    }
}
