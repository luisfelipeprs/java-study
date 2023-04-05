package exercicios.ex9;
import java.util.Scanner;
public class exercicio9 {

    /*public static int mdc(int numberOne, int numberTwo) {



    if (numberTwo == 0)
    {
        return numberOne;

    }

    else{
        return mdc(numberTwo, numberOne % numberTwo);


    }


}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numberOne = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numberTwo = scanner.nextInt();
        int mdc = mdc(numberOne,numberTwo);
        System.out.println("MDC de "+numberOne+" e "+numberTwo+" = "+mdc);

    }
*/
        public static int mdc(int numberOne, int numberTwo) {
            while (numberTwo != 0) {
                int r = numberOne % numberTwo;
                numberOne = numberTwo;
                numberTwo = r;
            }
            return numberOne;
        }

        public static void main(String[] args) {
            System.out.println();
            int numberOne = 12;
            int numberTwo = 18;
            int mdc = mdc(numberOne, numberTwo);
            System.out.println("MDC de " + numberOne + " e " + numberTwo + " = " + mdc);
        }
    }



