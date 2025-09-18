//Crie uma classe de exceção personalizada chamada IdadeInvalidaException.
// Implemente um programa que peça a idade de uma pessoa e lance essa exceção se a idade for negativa ou maior que 150.
import java.util.Scanner;
public class LPL03EX04 {

    public static class IdadeInvalidaException extends Exception {
        public IdadeInvalidaException(String mensagem) {
            super(mensagem);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Qual é a sua idade? ");
            int idade = scanner.nextInt();
            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException("Idade inválida.");
            }
            System.out.println("Sua idade é: " + idade);

        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Programa continua executando normalmente.");
    }
}
