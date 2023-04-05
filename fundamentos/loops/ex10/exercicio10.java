package exercicios.ex10;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isVerificationYes = false;

        do {
            System.out.println("Olá, qual o seu nome?: ");
            String name = scanner.nextLine();

            System.out.println("Olá " + name + ", digite um número: ");
            int numberFirst = scanner.nextInt();

            System.out.println(name + ", digite outro número: ");
            int numberSec = scanner.nextInt();

            int resultado = (numberFirst+numberSec);
            System.out.println("O resultado da soma de "+numberFirst+" + "+numberSec+" é igual a: "+resultado);
            System.out.println("Quer executar o programa novamente? y/n");
            String verificationYesNot = scanner.next();
            if (verificationYesNot.equals("y")) {
                isVerificationYes = true;
            } else {
                isVerificationYes = false;
            }

            scanner.nextLine(); // consome a nova linha deixada pelo nextInt()

        } while (isVerificationYes);

    }
}
