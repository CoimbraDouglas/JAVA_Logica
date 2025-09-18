//Escreva uma função recursiva que conte o número de elementos pares em um array.
import java.util.Scanner;
public class L02EX08 {
    public static int contarPares(int[] vetor, int tamanho){
        if(tamanho<0){
            return 0;
        }
        int contar = (vetor[tamanho]%2==0)?1:0;
        return contar +contarPares(vetor, tamanho-1);
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
        int resultado = contarPares(vetor, tamanho);
        System.out.println("O número de elementos pares no seu Array é: "+ resultado);
    }
}
