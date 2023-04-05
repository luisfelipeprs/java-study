package exercicios.ex8;
import java.util.Scanner;

public class exercicio8 {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numberMain = scanner.nextInt();

        if (isPrime(numberMain)) {
            System.out.println(numberMain + " é primo");
        } else {
            System.out.println(numberMain + " não é primo");
        }
    }
}