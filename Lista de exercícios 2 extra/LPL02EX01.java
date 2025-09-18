//Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.

import java.util.Scanner;
public class LPL02EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        int resultado = media(num1,num2,num3);
        System.out.println("A media de: "+num1+", "+num2+" e "+num3+" é igual a: "+resultado);
    }

    public static int media (int a, int b, int c){
        return (a + b + c)/3;
    }
}