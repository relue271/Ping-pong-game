import java.util.Scanner;




public class pingponggame {

	public static void imprimir(String tabuleiro[][], int m, int n) {

		System.out.println("==========================================================");
		for (int i=0; i<m; i++) {
			System.out.print("=");
			for (int j=0; j<n; j++) {
				System.out.print(tabuleiro[i][j]);

			}
			System.out.println("="); 
		}
		System.out.println("==========================================================");
		System.out.println("\n");

		
	}


	public static void main(String[] args) {
		Scanner player1 = new Scanner(System.in);
		System.out.print("Digite seu nome:");
		String idade = player1.nextLine();
		System.out.println("");



		int m = 10;
		int n = 55;
		String[][] tabuleiro = new String[m][n];
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				tabuleiro[i][j] = " ";
			}
		}


		while (true) {

			try { Thread.sleep(500); } catch(InterruptedException ex) {}

			imprimir(tabuleiro, m, n);

		}
	}
}
