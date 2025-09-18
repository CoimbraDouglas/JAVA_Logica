import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Quantas linhas tem sua primeira tabela? ");
	int linhas1 = scanner.nextInt();
	System.out.println("Quantas colunas tem sua primeira tabela? ");
	int colunas1=scanner.nextInt();
	int[][] MAT01 = new int[linhas1][colunas1];	
	
	System.out.println("Quantas linhas tem sua segunda tabela? ");
	int linhas2 = scanner.nextInt();
	System.out.println("Quantas colunas tem sua segunda tabela? ");
	int colunas2=scanner.nextInt();

	int[][] MAT02 = new int[linhas2][colunas2];

    if (colunas1 == linhas2){
	//Para que a multiplicação de duas matrizes seja possível, é necessário que o número de colunas da primeira matriz seja igual ao número de linhas da segunda matriz.
	
		for(int i=0;i<linhas1;i++){
			for(int j=0;j<colunas1;j++){
				System.out.println("Informe o valor para a posição [ " +i+ " ] e [ " +j+ " ] da matriz1: ");
			MAT01[i][j] = scanner.nextInt();
		}
	}
	
		for(int i=0;i<linhas2;i++){
			for(int j=0;j<colunas2;j++){
				System.out.println("Informe o valor para a posição [ " +i+ " ] e [ " +j+ " ] da matriz2: ");
			MAT02[i][j] = scanner.nextInt();
	}
	}
		int[][] MAT03 = new int[linhas1][colunas2];

		

		System.out.println("A matriz1 criada é:  ");
			for(int i=0;i<linhas1;i++){
				for(int j=0;j<colunas1;j++){
		System.out.print(MAT01[i][j] + "" );
		}
	}
	    	System.out.println();
		System.out.println("A matriz2 criada é:  ");
			for(int i=0;i<linhas2;i++){
				for(int j=0;j<colunas2;j++){
		System.out.print(MAT02[i][j] + "" );
	    }
	}
	}else {
	
		System.out.println("As matrizes não podem ser multiplicadas.");	
	
    }
       
}
}