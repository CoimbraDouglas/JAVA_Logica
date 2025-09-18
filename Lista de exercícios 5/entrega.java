//Implementar o algoritmo de ordenação por inserção.
//Implementar uma função responsável por transformar um vetor em um heap máximo.
import java.util.Scanner;
public class entrega {
    public static void insercao(int[] vetor) {
        for (int pos_chave = 1; pos_chave < vetor.length; pos_chave++) {
            int chave = vetor[pos_chave];
            int i = pos_chave - 1;

            while (i >= 0 && vetor[i] > chave) {
                vetor[i + 1] = vetor[i];
                i--;
            }
            vetor[i + 1] = chave;
        }
    }

    public static void aplicarHeap(int[] vetor, int tamanho, int i ){
        int pai = i;
        int esquerda = 2*i+1;
        int direita = 2*i+2;
        if (esquerda<tamanho && vetor[esquerda]>vetor[pai]){
            pai = esquerda;
        }
        if (direita<tamanho && vetor[direita]>vetor[pai]){
            pai = direita;
        }
        if (pai != i){
            int aux = vetor[i];
            vetor[i] = vetor[pai];
            vetor[pai] = aux;
            aplicarHeap(vetor, tamanho, pai);
        }
    }
    public static void construirHeap(int vetor[], int tamanho){

        for(int i = (int)(Math.floor(tamanho/2)-1); i>=0; i--){
            aplicarHeap(vetor, tamanho, i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do seu vetor: ");
        int tamanho = scanner.nextInt();

        int[] VET1 = new int[tamanho];
        System.out.println("Digite os elementos do vetor, separando-os com ENTER:");
        for (int i = 0; i < tamanho; i++) {
            VET1[i] = scanner.nextInt();
        }

        System.out.println("O seu Vetor original é:");
        for (int i = 1; i < VET1.length; i++) {
            System.out.print(VET1 + " ");
        }
        insercao(VET1);
        System.out.println("\nO seu Vetor após a ordenação por inserção:");
        for (int num : VET1) {
            System.out.print(num + " ");
        }
    }

}
