package exercicios.ex13;

public class exercicio13 {
    // TODO: Perguntar pro small
        public static void main(String[] args) {
            int num, originalNum, remainder, result;
            for (num = 1; num <= 500; num++) {
                result = 0;
                originalNum = num;

                while (originalNum != 0) {
                    remainder = originalNum % 10;
                    result += Math.pow(remainder, 3);
                    originalNum /= 10;
                }

                if (result == num) {
                    System.out.print(num + " ");
                }
            }
        }
}


