package exercise.ex4;

import java.util.Arrays;

public class OrdenaVetor {
        public static void crescente(int[] vetor) {
            Arrays.sort(vetor);
        }
        public static void decrescente(int[] vetor) {
            Arrays.sort(vetor);
            int[] vetorDecrescente = new int[vetor.length];
            for (int i = 0; i < vetor.length; i++) {
                vetorDecrescente[i] = vetor[vetor.length - i - 1];
            }
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = vetorDecrescente[i];
            }
    }
}
