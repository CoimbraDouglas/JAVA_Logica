//Escreva uma função recursiva que encontre o maior elemento em um array de inteiros.
import java.util.Scanner;
public class L02EX04 {
    public static int maiorInteiro(int[]vetor, int tamanho, int maior){
        if (tamanho == vetor.length) {
            return maior;
        }
        if (vetor[tamanho] > maior) {// Atualiza o maior atual se o elemento atual for maior
            maior = vetor[tamanho];
        }// Chamada recursiva para o próximo índice
        return maiorInteiro(vetor, tamanho + 1, maior);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do seu Array: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        System.out.println("Digite os elementos do seu Array:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }
        int maior = maiorInteiro(vetor, 0,vetor[0]);
        System.out.println("O maior elemento do seu Array é: "+ maior);
    }
}