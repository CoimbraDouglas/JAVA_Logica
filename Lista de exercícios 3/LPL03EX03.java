//Crie um programa que tente acessar um índice fora do limite de um array e trate a exceção.

public class LPL03EX03 {
    public static void main(String[] args) {
        int[] vetor = {1,14,65,9,15};

        try {
            System.out.println("Número no índice 10: " + vetor[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Tentou acessar um índice fora do limite do array.");
        }

        System.out.println("Programa continua executando normalmente.");
    }
}

