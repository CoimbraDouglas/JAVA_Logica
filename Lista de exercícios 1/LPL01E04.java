import java.util.Scanner;

public class LPL01E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] VET01 = new int[100];

        System.out.println("Digite um valor para a primeira posição do vetor N: ");
        VET01[0] = scanner.nextInt();

        for (int i = 1; i < VET01.length; i++) {
            VET01[i] = VET01[i - 1] / 2;
        }
        System.out.println("Valores no vetor N:");
        for (int i = 0; i < VET01.length; i++) {
            System.out.print(VET01[i]);
            if (i < VET01.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
