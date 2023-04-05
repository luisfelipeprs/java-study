package exercicios.ex16;
import java.util.Scanner;
public class exercicio16 {

        public static void main(String[] args) {
            int n;
            double result = 0.0;
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o valor de n: ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    result -= 1.0 / i;
                } else {
                    result += 1.0 / i;
                }
            }

            System.out.println("O logaritmo natural de 2 com " + n + " termos é: " + result);
        }
    }


