//Implemente uma função recursiva que calcule a soma de todos os números naturais de 1 a n.
import java.util.Scanner;
public class L02EX09 {
    public static int somaInteiros(int n){
        if (n==1){
            return 1;
        }
        return n + somaInteiros(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcule a soma de todos os números naturais de 1 até n.");
        System.out.println("Informe o valor de n: ");
        int n = scanner.nextInt();
        int resultado = somaInteiros(n);
        System.out.println("A soma de todos os números naturais de 1 até : "+n+", é igual a: "+resultado);
    }
}
