//Crie um programa que tente dividir dois números e realizar operações com um array.
// rate as múltiplas exceções usando try-catch.
import java.util.Scanner;
public class LPL03EX06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o denominador: ");
            int denominador = scanner.nextInt();

            int resultadoDivisao = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultadoDivisao);

            int[] vetor = {10, 20, 30, 40, 50};
            System.out.print("Digite a possição do vetor que você quer acessar: ");
            int posicao = scanner.nextInt();

            System.out.println("Valor no índice " + posicao + ": " + vetor[posicao]);

        } catch (ArithmeticException e) {
            System.out.println("Não se pode dividir por zero.");
        } catch (Exception e) {
            System.out.println("O programa não pode ser executado.");
        }
    }
}
