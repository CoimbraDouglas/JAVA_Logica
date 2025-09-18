/*
Aluno: Douglas Coimbra Laass
RA: 12122397
 */

import java.util.Random;
import java.util.Scanner;

public class algoritmoOrdenacao{
    //Ordenação por bolhas
    public static void vetorOrganizado(int[] vet, int tamanho){
        if(tamanho == 0){
            return ;
        }
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i -1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
        }
    }
    // Ordenacao por heapSort
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
            trocarValores(vetor, i, pai);
            aplicarHeap(vetor, tamanho, pai);
        }
    }
    public static void construirHeap(int[] vetor, int tamanho){
        for(int i = (int)(Math.floor(tamanho/2)-1); i>=0; i--){
            aplicarHeap(vetor, tamanho, i);
        }
    }
    public static void heapSort(int v[], int tamanho){
        construirHeap(v,tamanho);
        for(int i = tamanho -1; i> 0; i--){
            int aux = v[i];

        }
    }
    //Ordencação por seleção
    public static void selecao(int[] vetor){
        for (int i = 0; i < vetor.length - 1; i++) {
            int pos = i;
            for(int j = i+1;j<vetor.length;j++ ){
                if(vetor[j]<vetor[pos]){
                    pos = j;
                }
            }
            trocarValores(vetor,i,pos);
        }
    }

    // Ordenacao por insercao
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
    // Ordenacao por mergeSort
    public static void mergeSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita){
            int mid = (esquerda + direita)/2;
            mergeSort(vetor, esquerda, mid);
            mergeSort(vetor, mid + 1, direita);
            merge(vetor,esquerda,mid,direita);
        }
    }
    public static void merge(int[] vetor, int esquerda, int mid, int direita) {
        int n1 = mid - esquerda + 1;
        int n2 = direita - mid;

        int[] esqVetor = new int [n1];
        int[] dirVetor = new int [n2];

        for(int i = 0; i<n1; i++){
            esqVetor[i] = vetor[esquerda + i];
        }
        for(int j = 0; j<n2; j++){
            dirVetor[j] = vetor[mid + 1 + j];
        }
        int i=0;
        int j=0;
        int k=esquerda;
        while (i < n1 && j < n2) {
            if (esqVetor[i] <= dirVetor[j]) {
                vetor[k] = esqVetor[i++];
                j++;
            } else {
                vetor[k] = dirVetor[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            vetor[k] = esqVetor[i];
            i++;
            j++;
        }
        while (j < n2) {
            vetor[k] = dirVetor[j];
            i++;
            k++;
        }
    }

    //Ordenacao por quickSort
    public static void QuickSort(int [] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int esq = inicio;
            int dir = fim;
            int pivo = vetor[inicio];

            while (esq < dir) {
                while (vetor[esq] < pivo) {
                    esq++;
                }
                while (vetor[dir] > pivo) {
                    dir--;
                }
                if (esq <= dir) {
                    trocarValores(vetor, esq, dir);
                    esq++;
                    dir--;
                }
            }
            QuickSort(vetor, inicio, dir);
            QuickSort(vetor, esq, fim);
        }
    }
    public static void QuickSort(int [] vetor){
        QuickSort(vetor, 0, vetor.length - 1);
    }

    //Metodo para fazer troca de posição no vetor
    public static void trocarValores(int[] vetor, int i, int j) {
        if (i >= 0 && j >= 0) {
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        } else {
            System.out.println("Valores invalidos para a troca de posição.");
        }
    }
    public static int[] copiaVetor(int vetor[]){
        int copia[] = new int [vetor.length];
        for(int i=0; i<vetor.length; i++){
            copia[i] = vetor[i];
        }
        return copia;
    }
    public static int[] gerarVetorAleatorio(int tamanho) {
        Random gerador = new Random();
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = gerador.nextInt(101);
        }
        return vetor;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor: ");
        int tamanho = ler.nextInt();
        int[] vetorOriginal = gerarVetorAleatorio(tamanho);

        int copia[];

        // Imprimir Bubble Sort
        copia = copiaVetor(vetorOriginal);
        long tempoInicial = System.currentTimeMillis();
        vetorOrganizado(copia, copia.length);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("O Tempo de execução do Bubble Sort é: " + (tempoFinal - tempoInicial));

        // Imprimir Heap Sort
        copia = copiaVetor(vetorOriginal);
        tempoInicial = System.currentTimeMillis();
        construirHeap(copia, copia.length);
        tempoFinal = System.currentTimeMillis();
        System.out.println("O Tempo de execução do Heap Sort é: " + (tempoFinal - tempoInicial));

        // Imprimir Insertion Sort
        copia = copiaVetor(vetorOriginal);
        tempoInicial = System.currentTimeMillis();
        insercao(copia);
        tempoFinal = System.currentTimeMillis();
        System.out.println("O Tempo de execução do Insertion Sort é: " + (tempoFinal - tempoInicial));

        // Imprimir Merge Sort
        copia = copiaVetor(vetorOriginal);
        tempoInicial = System.currentTimeMillis();
        mergeSort(copia, 0, copia.length - 1);
        tempoFinal = System.currentTimeMillis();
        System.out.println("O Tempo de execução do Merge Sort é: " + (tempoFinal - tempoInicial));

        // Imprimir QuickSort
        copia = copiaVetor(vetorOriginal);
        tempoInicial = System.currentTimeMillis();
        QuickSort(copia);
        tempoFinal = System.currentTimeMillis();
        System.out.println("O Tempo de execução do Quick Sort é: " + (tempoFinal - tempoInicial));

        //Imprimir SelectionSort
        copia = copiaVetor(vetorOriginal);
        tempoInicial = System.currentTimeMillis();
        selecao(copia);
        tempoFinal = System.currentTimeMillis();
        System.out.println("O Tempo de execução do Selection Sort é: " + (tempoFinal - tempoInicial));
    }
}