package exercise.ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Felipe");
        aluno1.setMatricula(121);
        aluno1.setNota1(10.0);
        aluno1.setNota2(10.0);
        aluno1.setTrabalho(10);

        Aluno aluno2 = new Aluno(123,"José", 5.0,10.0,10);
        Aluno aluno4 = new Aluno(123,"José", 5.0,10.0,10);

        System.out.println(aluno1);
        System.out.println(aluno2);
        Aluno aluno3 = aluno2;





        System.out.println(aluno3);
        if (aluno4.equals(aluno2)){

            System.out.println("é igual!");

        }
        else {
            System.out.println("né não");

        }




    }


    }

