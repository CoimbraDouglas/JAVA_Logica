//Implemente o cálculo da sequência de Collatz:
//Dado um número n, se n for par, divida por 2; se for ímpar, multiplique por 3 e some 1.
//Repita o processo até n chegar a 1.
//Retorne o número de passos necessários para atingir 1.

import java.util.Scanner;
public class ex03 {

    public static int contador = -1;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor para ser calculada a sequência de Collatz: ");
        int n = ler.nextInt();
        int resultado = calculo(n);

        System.out.println("Resultado é: " + resultado);
        System.out.println("O calculo foi executado: " +contador+" vezes.");
    }
    public static int calculo(int n){
        contador++;
        if (n == 1) {
            return n;
        }
        if (n % 2 == 0){
            return calculo(n / 2);
        }
        if (n % 2 != 0){
            return calculo((n * 3)+1);
        }
        return calculo(n);
    }
}