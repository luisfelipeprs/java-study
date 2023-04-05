package exercicios.ex18;
import java.util.Scanner;
public class exercicio18 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Imprime a sequência i)
            System.out.println("i)");
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            // Imprime a sequência ii)
            System.out.println("ii)");
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            // Imprime a sequência iii)
            System.out.println("iii)");
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            // Imprime a sequência iv)
            System.out.println("iv)");
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            // Imprime a sequência v)
            System.out.println("v)");
            System.out.print("Digite o número de linhas: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(i);
                }
                System.out.println();
            }
            System.out.println();

            // Imprime a sequência vi)
            System.out.println("vi)");
            System.out.print("Digite o número de linhas: ");
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k >= 1; k--) {
                    System.out.print(k);
                }
                for (int k = 2; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }

            sc.close();
        }

    }


