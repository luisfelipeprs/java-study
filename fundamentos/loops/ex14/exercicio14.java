package exercicios.ex14;
import java.util.Scanner;
public class exercicio14 {
        public static void main(String[] args) {
            int n, firstTerm = 0, secondTerm = 1;
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o número de termos: ");
            n = input.nextInt();

            System.out.print("Série Fibonacci de " + n + " termos:");

            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + " ");

                int sum = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = sum;
            }
        }
    }

