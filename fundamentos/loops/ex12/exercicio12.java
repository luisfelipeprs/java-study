package exercicios.ex12;
import java.util.ArrayList;
import java.util.Scanner;
public class exercicio12 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while(continuar) {
            System.out.print("Insira um número (ou digite 'parar' para terminar): ");
            String input = sc.nextLine();

            if(input.equals("parar")) {
                continuar = false;
            } else {
                try {
                    int numero = Integer.parseInt(input);
                    numeros.add(numero);
                } catch(NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido ou 'parar'.");
                }
            }
        }

        if(numeros.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            int maior = numeros.get(0);
            int menor = numeros.get(0);

            for(int i = 1; i < numeros.size(); i++) {
                int numeroAtual = numeros.get(i);

                if(numeroAtual > maior) {
                    maior = numeroAtual;
                }

                if(numeroAtual < menor) {
                    menor = numeroAtual;
                }
            }

            System.out.println("O maior número inserido foi: " + maior);
            System.out.println("O menor número inserido foi: " + menor);
        }
    }
}



