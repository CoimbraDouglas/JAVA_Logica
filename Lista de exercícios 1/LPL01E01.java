//Escreva um programa que crie um vetor de números inteiros, receba 10 valores informados pelo usuário, imprima todos os valores pares e depois todos os valores ímpares.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] VET01 = new int[10];
        System.out.println("Declare os 10 valores para o vetor: ");
        for (int i = 0; i < VET01.length; i++) {
            VET01[i] = scanner.nextInt();
        }
        System.out.println("Os valores pares informados foram: ");
        for (int i = 0; i < VET01.length; i++) {
            if (VET01[i] % 2 == 0) {
                System.out.println(VET01[i]);
            }
        }
        System.out.println("Os valores impares informados foram: ");
        for (int i = 0; i < VET01.length; i++) {
            if (VET01[i] % 2 != 0) {
                System.out.println(VET01[i]);
            }
        }
    }
}