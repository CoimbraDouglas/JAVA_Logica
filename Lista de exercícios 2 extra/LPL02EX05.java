//Faça um programa que leia o valor de 4 produtos e informe o valor final que deverá ser pago pelo cliente de acordo com as seguintes regras
import java.util.Scanner;
public class LPL02EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor  do primeiro produto: ");
        double num1 = scanner.nextDouble();
        System.out.println("Informe o valor  do segundo produto: ");
        double num2 = scanner.nextDouble();
        System.out.println("Informe o valor  do terceiro produto: ");
        double num3 = scanner.nextDouble();
        System.out.println("Informe o valor  do quarto produto: ");
        double num4 = scanner.nextDouble();

        double valorTotal = (num1+num2+num3+num4);
        System.out.println("O valor total da sua conta é: R$ "+valorTotal);
        //O cliente pagará 100% do valor caso o total da compra seja menor ou igual do que R$100,00.
        if(valorTotal<=100){
            System.out.println("O valor total a ser pago é: R$ " + (num1+num2+num3+num4));
        }
        //O cliente terá um desconto de 10% no valor do primeiro produto caso o valor total dos 4 produtos seja maior que R$100,00 e menor que R$200,00.
        if(valorTotal>100 && valorTotal<= 200){
            System.out.println("O valor total a ser pago é: R$ " +((num2+num3+num4)+(num1-num1*0.1)));
        }
        //O cliente terá um desconto de 15% no valor dos dois primeiros produtos caso o valor total dos 4 produtos esteja entre R$200,00 e R$500,00.
        if(valorTotal>200 && valorTotal<= 500){
            System.out.println("O valor total a ser pago é: R$ " +(num3+num4)+(num1-num1*0.15)+(num2-num2*0.15));
        }
        //O cliente terá 25% de desconto caso o valor total dos 4 seja maior que R$500,00.
        if(valorTotal>500){
            System.out.println("O valor total a ser pago é: R$ " +(valorTotal-valorTotal*0.25));
        }

    }
}
