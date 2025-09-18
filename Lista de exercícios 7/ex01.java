//1 . Dado um vetor v de tamanho n e uma matriz A de tamanho nxn,
//Crie um programa para calcular o produto v*A, resultando em um novo vetor.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Digite o tamanho do seu vetor: ");
        int tamVetor = ler.nextInt();

        int[] v = new int[tamVetor];
        int[][] m = new int[tamVetor][tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            v[i] = rand.nextInt(11);
        }
        for (int i = 0; i < tamVetor; i++) {
            for (int j = 0; j < tamVetor; j++) {
                m[i][j] = rand.nextInt(11);
            }
        }

        System.out.println("A matrix original é: ");
        for (int i = 0; i < tamVetor; i++) {
            for (int j = 0; j < tamVetor; j++) {
                System.out.printf("%2d |", m[i][j]);
                }
            System.out.println();
        }
        System.out.println("O Vetor original é: "+ Arrays.toString(v));


        int[] resultado = new int[tamVetor];

        for (int i = 0; i < tamVetor; i++){
            for (int j = 0; j < tamVetor; j++) {
                resultado[i] += v[j] * m[j][i];
            }
        }

        System.out.println("A multiplicação do vetor é: "+ Arrays.toString(resultado));

    }
}

