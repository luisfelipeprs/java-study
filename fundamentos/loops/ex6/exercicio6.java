package exercicios.ex6;


import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite a sequência a ser invertida: ");
                String sequencia = scanner.nextLine();
                String sequenciaInvertida = "";

                for (int i = sequencia.length() - 1; i >= 0; i--) {
                    sequenciaInvertida += sequencia.charAt(i);
                }

                System.out.println("Sequência invertida: " + sequenciaInvertida);
            }
        }


