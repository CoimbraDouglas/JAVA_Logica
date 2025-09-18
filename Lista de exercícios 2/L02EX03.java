//Implemente uma função recursiva que inverta uma string.
import java.util.Scanner;
public class L02EX03 {
    public static String inverterString(String palavra){
        if (palavra.length() <= 1) {
            return palavra;
        }
        return inverterString(palavra.substring(1)) + palavra.charAt(0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para ser invertida: ");
        String palavra = scanner.nextLine();
        String inversao = inverterString(palavra);
        System.out.println("A palavra: "+palavra+ ", invertida é: "+inversao);
    }
}
