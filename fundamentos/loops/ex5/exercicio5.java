package exercicios.ex5;
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numberBase = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numberUp = scanner.nextInt();
        int resultado = 1;
        for(int i=1; i<=numberUp;i++){


        resultado *= numberBase;
        // TODO: perguntar pro small!


        }
        System.out.println("result: "+resultado);

    }
}
