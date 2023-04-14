package exercise.ex4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        OrdenaVetor ordenador = new OrdenaVetor();

        // crescente
        ordenador.crescente(vetor);
        System.out.println(Arrays.toString(vetor));


        // decrescente
        ordenador.decrescente(vetor);
        System.out.println(Arrays.toString(vetor));
    }
}
