//Implemente uma função recursiva que calcule a soma de todos os elementos de um array.
import java.util.Scanner;
public class L02EX05 {
    public static int somaVetor(int[]vetor, int tamanho){
        if (tamanho == vetor.length) {
            return 0;
        }
        return vetor[tamanho] + somaVetor(vetor, tamanho + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do seu Array: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        System.out.println("Digite os elementos do seu Array: ");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }
        int maior = somaVetor(vetor, 0);
        System.out.println("A soma dos elementos do Array é: "+ maior);
    }
}

