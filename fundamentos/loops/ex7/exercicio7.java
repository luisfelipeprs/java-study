// Escreva um programa que leia um conjunto de números inteiros e, em seguida, imprima a soma dos números inteiros pares e ímpares.


package exercicios.ex7;
import java.util.Arrays;
import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite vários números separados por espaço: ");
        String numbersInput = scanner.nextLine();
        String[] numeros = numbersInput.split(" "); //  usamos o método split() para dividir a string em substrings com base no espaço em branco.
        int[] numbersArray = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            numbersArray[i] = Integer.parseInt(numeros[i]);
        }

        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0) {
                somaPares += numbersArray[i];
            }
            else {

                somaImpares += numbersArray[i];
            }
        }


        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
    }
}

