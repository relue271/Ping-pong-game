public class pingponggame {

        public static void imprimir() {

                System.out.println("==========================================================");
                for (int i=0; i<=10; i++) {
                        System.out.print("=");
                        for (int j=0; j<=55; j++) {
                                System.out.print(" ");

                        }
                        System.out.println("=");
                }
                System.out.println("==========================================================");
                System.out.println("\n");


        }


        public static void main(String[] args) {
                while (true) {

                        try { Thread.sleep(500); } catch(InterruptedException ex) {}

                        imprimir();

                }
        }
}
