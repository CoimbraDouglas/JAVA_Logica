//Escreva uma função recursiva que converta um número decimal para binário.
import java.util.Scanner;
public class L02EX10 {
    public static String binario(int numero) {
        if (numero == 0) {
            return "0";
        }
        return binario(numero / 2) + (numero % 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número inteiro que você deseja converter em binário: ");
        int numero = scanner.nextInt();

        String resultado = binario(numero);
        System.out.println("O número " + numero + " em binário é: " + resultado);
    }
}


