package exercicios.ex19;
import java.util.Scanner;

public class exercicio19 {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Digite o valor de x em radianos: ");
            double x = input.nextDouble();
            System.out.print("Digite o número de termos n: ");
            int n = input.nextInt();

            double result = 0.0;
            double termo = x;
            int sinal = -1;
            int fatorial = 1;

            for(int i=1; i<=n; i++) {
                result += sinal * termo / fatorial;
                termo *= x * x;
                fatorial *= (2 * i) * (2 * i + 1);
                sinal *= -1;
            }

            System.out.println("O valor de sen(" + x + ") é " + result);

            input.close();
        }
    }


