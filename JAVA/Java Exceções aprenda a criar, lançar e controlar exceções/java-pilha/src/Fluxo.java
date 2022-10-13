public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();	
        } catch(Exception ex){
        	String msg = ex.getMessage();
        	System.out.println("main - "+msg);
        	ex.printStackTrace(); // mostra por onde o erro passou
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
//        try {
//        	metodo2();
//        } catch(ArithmeticException ex) {
//        	System.out.println("metodo 1 - ArithmeticException");
//        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i/0;
//            Conta c = null;
//            c.deposita();
//            try {
//            	int a = i/0;
//            } catch(ArithmeticException ex) {
//            	System.out.println("metodo 2 -ArithmeticException");
//            }
        }
        System.out.println("Fim do metodo2");
    }
}