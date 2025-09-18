//Faça um programa que receba o salário de um funcionário e o aumento, calcule e mostre o novo salário.
import java.util.Scanner;
public class LPL02EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o salário atual do funcionário: ");
        int num1 = scanner.nextInt();
        System.out.println("Informe quantos porcento o salário atual do funcionário aumentará: ");
        double aum1 = scanner.nextInt();

        double salarionovo = (num1 * ((aum1/100)+1));

        System.out.println("O salário atual do funcionário: R$ "+ num1);
        System.out.println("O salário do funcionário pós acrecimo de: "+aum1+ "% é igual a: R$ "+salarionovo);
    }
}