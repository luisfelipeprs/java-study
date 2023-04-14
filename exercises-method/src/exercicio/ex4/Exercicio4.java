package exercicio.ex4;

import java.util.Scanner;

public class Exercicio4 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int num = input.nextInt();
        boolean isNumPrime = isPrime(num);

        System.out.println("O número " + num + " é primo? " + isNumPrime);

        System.out.print("Deseja exibir todos os números primos entre 1 e 500? (S/N): ");
        String resposta = input.next();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Números primos entre 1 e 500:");
            for (int i = 1; i <= 500; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
