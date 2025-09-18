//Peça ao usuário para digitar um número.
//Trate a exceção caso o usuário insira algo que não seja um número.
import java.util.Scanner;
public class LPL03EX02 {
    public static void lerNumero() throws java.lang.NumberFormatException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("O valor digitado é: " +a);
    }
    public static void main(String[] args) {
        try{
            lerNumero();
        }
        catch (java.lang.NumberFormatException e){
            System.out.println("Não foi possível converter o número.");
        }
    }
}