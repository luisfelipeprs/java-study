package exercicios.ex11;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, qtdPos = 0, qtdNeg = 0, qtdZero = 0;
        char continuar = 's';

        while(continuar == 's') {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if(num > 0) {
                qtdPos++;
            }
            else if(num < 0) {
                qtdNeg++;
            }
            else {
                qtdZero++;
            }

            System.out.print("Deseja inserir mais um número? (s/n) ");
            continuar = sc.next().charAt(0);
        }

        System.out.println("Quantidade de números positivos: " + qtdPos);
        System.out.println("Quantidade de números negativos: " + qtdNeg);
        System.out.println("Quantidade de números zeros: " + qtdZero);

        sc.close();
    }

}
