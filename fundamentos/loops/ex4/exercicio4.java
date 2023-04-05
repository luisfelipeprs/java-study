package exercicios.ex4;
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 1;
        int secondNumber;
        System.out.println("Insira um número inteiro positivo:");
        int numberMain = scanner.nextInt();
        for(int i = 1;i<=numberMain;i++){


            secondNumber = resultado;
            resultado *= i;

            System.out.println(secondNumber+"x"+i+"="+resultado);
        }

    }
}
