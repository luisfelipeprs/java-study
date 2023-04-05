package exercicios.ex17;
import java.util.Random;
import java.util.Scanner;
public class exercicio17 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            int numAleatorio = rand.nextInt(100) + 1;
            int palpite;

            System.out.println("Adivinhe qual é o número entre 1 e 100!");

            do {
                System.out.print("Digite o seu palpite: ");
                palpite = sc.nextInt();

                if(palpite > numAleatorio) {
                    System.out.println("Muito alto, tente novamente.");
                }
                else if(palpite < numAleatorio) {
                    System.out.println("Muito baixo, tente novamente.");
                }
            } while(palpite != numAleatorio);

            System.out.println("Parabéns, você acertou o número " + numAleatorio + "!");

            sc.close();
        }

    }


