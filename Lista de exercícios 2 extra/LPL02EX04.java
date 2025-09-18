//Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber.
//Sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% sobre este salário.

import java.util.Scanner;
public class LPL02EX04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o salário atual do funcionário: ");
        int num1 = scanner.nextInt();

        double aumento = (num1 *1.05);
        double imposto = (num1 *0.07);
        double salarionovo = (aumento - imposto);

        System.out.println("O salário atual do funcionário: R$ "+ num1);
        System.out.println("O salário do funcionário pós acrécimo e dedução fiscal é igual a: R$ "+salarionovo);
    }
}
