package exercise.ex1;

import java.util.Objects;

public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double trabalho;


    public Aluno(){



    }

    public Aluno(int matricula, String nome, double nota1, double nota2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }

    public double media() {
        double media_provas = (nota1 + nota2) / 2;
        double media_final = (media_provas * 2.5 + trabalho * 2) / 7.5;
        return media_final;
    }

    public double final_() {
        double media = media();
        if (media >= 6) {
            return 0;
        } else {
            double nota_final = (60 - (media * 10)) / 2;
            return nota_final;
        }
    }

    public String status() {
        double media = media();
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;



    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", trabalho=" + trabalho +
                '}';

    }


    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome, nota1, nota2, trabalho);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula && Double.compare(aluno.nota1, nota1) == 0 && Double.compare(aluno.nota2, nota2) == 0 && Double.compare(aluno.trabalho, trabalho) == 0 && Objects.equals(nome, aluno.nome);
    }
}
