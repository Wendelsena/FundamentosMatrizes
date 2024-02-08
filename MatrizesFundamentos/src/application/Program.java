package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o tamanho da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];// [] [] para mostrar que será um arranjo bidimensional. 3 seria
									// tridimencional).
		// matriz recebendo n linhas e n colunas.

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) { // dois for para percorrer a matriz nas duas dimensões.
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " "); // para exibir a diagonal principal.
		}

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) { // mat[i] para dizer que sobre colunas e não linhas.
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println();
		System.out.println("Negative numbers: " + count);

		sc.close();

	}

}
