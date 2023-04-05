package exercicios.ex15;
import java.util.Scanner;


public class exercicio15 {

        public static void main(String[] args) {
            int n;
            double sum = 0.0;
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o valor de n: ");
            n = input.nextInt();

            for (int i = 1; i <= n; ++i) {
                sum += 1.0 / i;
            }

            System.out.print("A soma da série é: " + sum);
        }
    }





