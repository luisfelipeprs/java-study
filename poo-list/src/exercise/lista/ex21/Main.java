package exercise.lista.ex21;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Felipe");
        pessoa.setId(0001);
        emprestimo.setPessoa(pessoa);

        Livro livro1 = new Livro();
        livro1.setNome("Pai rico, pai pobre");
        livro1.setId(7863);
        emprestimo.addLivro(livro1);

        Livro livro2 = new Livro();
        livro2.setNome("Peter Pan");
        livro2.setId(7021);
        emprestimo.addLivro(livro2);

        Livro livro3 = new Livro();
        livro3.setNome("Java for beginners");
        livro3.setId(2063);
        emprestimo.addLivro(livro3);

        emprestimo.setDataEmprestimo(new Date("04/08/2023"));
        emprestimo.setDataDevolucao(new Date("20/04/2023"));

        System.out.println(emprestimo);
    }
}
