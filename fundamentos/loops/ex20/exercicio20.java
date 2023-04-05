package exercicios.ex20;
import java.util.Scanner;



public class exercicio20 {




        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Digite o valor de x em radianos: ");
            double x = input.nextDouble();
            System.out.print("Digite o número de termos n: ");
            int n = input.nextInt();

            double result = 1.0;
            double termo = 1.0;
            int sinal = -1;
            int fatorial = 2;

            for(int i=1; i<=n; i++) {
                result += sinal * termo / fatorial;
                termo *= x * x;
                fatorial *= (2 * i + 1) * (2 * i);
                sinal *= -1;
            }

            System.out.println("O valor de cos(" + x + ") é " + result);

            input.close();
        }
    }
    

