//Escreva uma função recursiva que verifique se uma string é um palíndromo (lê-se da mesma forma de frente para trás e vice-versa).
import java.util.Scanner;
public class L02EX06 {
    public static boolean palindromo(String palavra, int inicial, int f){
        if (inicial==f){
            return palavra.charAt(inicial)==palavra.charAt(f);
        }
        if(inicial == f - 1){
            return palavra.charAt(inicial) == palavra.charAt(f);
        }
        if (palavra.charAt(inicial) == palavra.charAt(f)){
            return palindromo(palavra, inicial +1, f -1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para verificar se é um palíndromo: ");
        String palavra = scanner.nextLine();
        boolean resultado = palindromo(palavra, 0, palavra.length() - 1);
        if (resultado) {
            System.out.println("A palavra: " + palavra + ", é um palíndromo.");
        } else {
            System.out.println("A palavra: " + palavra + ", não é um palíndromo.");
        }
    }
}
