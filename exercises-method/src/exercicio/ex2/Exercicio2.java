package exercicio.ex2;

public class Exercicio2 {
    public static void main(String[] args) {
    boolean resultado = isEven(2);

        System.out.println(resultado);

    }
    public static boolean isEven(int a){

        if (a % 2 == 0){
            return true;


        }

        else {
            return false;
        }



    }

}
