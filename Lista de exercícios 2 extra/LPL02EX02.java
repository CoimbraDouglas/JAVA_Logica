//Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números
import java.util.Scanner;
public class LPL02EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();
        System.out.println("Digite o quarto número inteiro: ");
        int num4 = scanner.nextInt();

        int soma = num1+num2+num3+num4;

        System.out.println("A soma de: "+num1+", "+num2+", "+num3+" e "+num4+ " é igual a: "+soma);

    }
}
