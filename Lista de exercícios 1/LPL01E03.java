//Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor de 10 posições. Em cada posição subsequente, coloque o dobro do valor da posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1, 2, 4, 8 e assim sucessivamente. Mostre o vetor em seguida.
import java.util.Scanner;
public class LPL01E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] VET01 = new int[10];
        System.out.println("Digite um valor para a primeira posição do vetor: ");
        VET01[0] = scanner.nextInt();
        for (int i = 1; i < VET01.length; i++) {
            VET01[i] = VET01[i - 1] * 2;
        }
        System.out.println("Valores no vetor:");
        for (int i = 0; i < VET01.length; i++) {
            System.out.print(VET01[i]);
            if (i < VET01.length - 1) {
                System.out.print(" ");
            }

        }
    }
}
