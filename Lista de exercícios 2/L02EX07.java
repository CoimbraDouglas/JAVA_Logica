//Implemente uma função recursiva para calcular o Máximo Divisor Comum (MDC) de dois números usando o algoritmo de Euclides.
import java.util.Scanner;
public class L02EX07 {
    public static int calcularMDC(int a, int b){
        if(b==0){
            return a;
        }
        return calcularMDC(b, a%b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor para descobrir o Máximo Divisor Comum (MDC), a: ");
        int a = scanner.nextInt();
        System.out.println("Digite o outro valor para descobrir o Máximo Divisor Comum (MDC), b: ");
        int b = scanner.nextInt();
        int resultado = calcularMDC(a,b);
        System.out.println("O o Máximo Divisor Comum (MDC), de a: "+a+", e b: "+b+", é igual a: "+resultado);
    }
}
