//Implementar o algoritmo de ordenação por bolha
public class LPEX2 {
    public static void vetorOrganizado(int[] vet, int tamanho){
        if(tamanho == 0){
            return ;
        }
        for (int i = 0; i < tamanho - 1; i++) {
            if (vet[i] > vet[i + 1]) {

                int temp = vet[i];
                vet[i] = vet[i + 1];
                vet[i + 1] = temp;
            }
        }
        vetorOrganizado(vet, tamanho - 1);
    }

    public static void main(String[] args) {
        int[] VETOR = {64, 34, 25, 12, 22, 11, 90, 1, 2, 3, 5, 6, 8, 9, 10, 47, 48, 59, 50, 20};

        System.out.println("Array original:");
        for (int i = 0; i < VETOR.length; i++) {
            System.out.print(VETOR[i] + " ");
        }
        System.out.println();

        vetorOrganizado(VETOR, VETOR.length);

        System.out.println("Array ordenado:");
        for (int i = 0; i < VETOR.length; i++) {
            System.out.print(VETOR[i] + " ");
        }
    }
}

