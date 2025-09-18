//Escreva um programa que leia 10 valores inteiros, informados pelo usuário e armazene-os em um vetor. Após isso, lendo o vetor uma única vez e sem criar outros vetores, mostre na tela a média dos valores armazenados no vetor ponderados pelos índices nos quais estão armazenados.
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] VET01 = new int[10];
        double soma = 0;

        System.out.println("Declare os 10 valores para o vetor: ");
        for (int i = 0; i < VET01.length; i++) {
            VET01[i] = scanner.nextInt();
        }

        for (int i = 0; i < VET01.length; i++) {
            soma += VET01[i];
        }

        double media = soma / VET01.length;
        System.out.println("A média dos valores no vetor é: " + media);

    }
}
