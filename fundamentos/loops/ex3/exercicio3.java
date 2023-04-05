package exercicios.ex3;
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro positivo:");
        int numberMain = scanner.nextInt();

        for(int x=1;x<=10;x++){

           int result = numberMain * x;
            System.out.println(numberMain+"x"+x+"="+result);

        }


    }
}
