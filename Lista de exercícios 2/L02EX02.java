//Escreva uma função recursiva que calcule a potência de um número, dado a base e o expoente.
import java.util.Scanner;
public class L02EX02 {
    public static int calculoPotencia(int base, int expoente) {
        if (base == 0) {
            return 0;}
        if (expoente == 0) {
            return 1;}
        return base * calculoPotencia(base, expoente - 1);
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        int base = scanner.nextInt();
        System.out.println("Digite o valor do expoente: ");
        int expoente = scanner.nextInt();
        int calc = calculoPotencia(base,expoente);
        System.out.println("O número "+base+" elevado a "+expoente+" é igual a "+calc);
    }
}
