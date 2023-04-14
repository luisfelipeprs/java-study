package exercise.lista.ex23;
import exercise.lista.ex23.figuras.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

                System.out.println("Escolha a figura geométrica:");
                System.out.println("1 - Quadrado");
                System.out.println("2 - Retângulo");
                System.out.println("3 - Triângulo");
                System.out.println("4 - Círculo");
                System.out.println("");

                int opcao = sc.nextInt();

                FiguraGeometrica figura;
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o lado do quadrado: ");
                        double lado = sc.nextDouble();
                        figura = new Quadrado(lado);
                        break;
                    case 2:
                        System.out.print("Digite a base do retângulo: ");
                        double base = sc.nextDouble();
                        System.out.print("Digite a altura do retângulo: ");
                        double altura = sc.nextDouble();
                        figura = new Retangulo(base, altura);
                        break;
                    case 3:
                        System.out.print("Digite a base do triângulo: ");
                        base = sc.nextDouble();
                        System.out.print("Digite a altura do triângulo: ");
                        altura = sc.nextDouble();
                        figura = new Triangulo(base, altura);
                        break;
                    case 4:
                        System.out.print("Digite o raio do círculo: ");
                        double raio = sc.nextDouble();
                        figura = new Circulo(raio);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        return;
                }

                double area = figura.calcularArea();
                System.out.println("A área da figura geométrica é: " + area);
            }
        }