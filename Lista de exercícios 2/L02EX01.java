//Escreva uma função recursiva que retorne a soma dos dígitos de um número inteiro.
import java.util.Scanner;
public class L02EX01 {
    public static int somaDigitos(int numero){
        if (numero == 0){
            return 0;
        }
        return (numero % 10) + somaDigitos(numero / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int soma = somaDigitos(numero);
        System.out.println("A soma dos digitos de: "+numero+", é igual a: "+soma);
    }
}
