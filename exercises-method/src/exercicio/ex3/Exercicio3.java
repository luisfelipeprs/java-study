package exercicio.ex3;

import java.util.Scanner;

public class Exercicio3 {

    // Método isVowel que verifica se um caractere é uma vogal
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // converte o caractere para minúsculo para facilitar a comparação

        // Verifica se o caractere é uma vogal
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma sequência de caracteres: ");
        String sequencia = scanner.nextLine();

        int contadorVogais = 0;
        for (int i = 0; i < sequencia.length(); i++) {
            if (isVowel(sequencia.charAt(i))) {
                contadorVogais++;
            }
        }

        System.out.println("Número de vogais na sequência: " + contadorVogais);
    }
}