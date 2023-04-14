package exercicio.ex5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = input.nextInt();
// TODO: como faz pra retornar true?
        System.out.println(isPalindrome(numero));
        input.close();
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int reversed = 0;
        int original = number;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original==reversed){
            return true;

        }
        else{
            return false;

        }



    }
}
