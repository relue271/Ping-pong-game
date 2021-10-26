import java.util.Scanner;




public class pingponggame {

        public static void imprimir(String tabuleiro[][], int m, int n) {

                System.out.println("==========================================================");
                for (int i=0; i<m; i++) {
                        System.out.print("=");
                        for (int j=0; j<n; j++) {
                                System.out.print(tabuleiro[i][j]);
                                //
                        }
                        System.out.println("=");
                }
                System.out.println("==========================================================");
                System.out.println("\n");


        }

        public static void bola(String tabuleiro[][], int l, int c, int Al, int Ac, int m, int n) {
                if (c == 1) {
                        System.out.println("---- Gol player 2 -------");
                }
                if (c == n) {
                        System.out.println("---- Gol player 1 -------");
                } else {
                        System.out.println("@");
                }
        }

        public static void players(String tabuleiro[][], int m, int n, int l, int c, int sentido) {

        }


        public static void main(String[] args) {



                //pegar nomes dos gamers
                //Scanner player1 = new Scanner(System.in);
                //System.out.print("Digite seu nome:");
                //String nome = player1.nextLine();
                
                //Scanner p2 = new Scanner(system.in);
                //System.out.print("Digite seu nome:");
                //String nome = p2.nextLine();
                //System.out.println("");





                //criar tabuleiro
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
