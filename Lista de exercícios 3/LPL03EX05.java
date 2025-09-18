//Crie uma função que calcula a raiz quadrada de um número, mas lance uma IllegalArgumentException se o número for negativo.
//A exceção deve ser capturada e tratada no método main.
import java.util.Scanner;
public class LPL03EX05 {
    public static double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada desse número.");
        }
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número para se calcular a raiz quadrada: ");
            double numero= scanner.nextInt();
            double resultado = raizQuadrada(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Programa continua executando normalmente.");
    }
}
