//Implemente um programa que peça dois números inteiros e tente realizar uma divisão.
//Trate a exceção de divisão por zero utilizando try-catch.
import java.util.InputMismatchException;
import java.util.Scanner;
public class LPL03EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Um programa que peça dois números inteiros e tente realizar uma divisão. ");
        System.out.println("Digite um número inteiro para divisão, a: ");
        int a = scanner.nextInt();
        System.out.println("Digite o outro número inteiro para divisão, b: ");
        int b = scanner.nextInt();
        try{
            int resultado = a/b;
            System.out.println("A divisão de a: "+a+", por b: "+b+" é igual: "+resultado);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
        /*catch (InputMismatchException e) {
            System.out.println("Insira apenas números inteiros.");
        }
        */
    }
}