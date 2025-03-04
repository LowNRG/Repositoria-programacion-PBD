package SumaDeDigitos;

public class solution {

    static java.util.Scanner in;


    public static boolean casoDePrueba() {
        //leer caso de prueba
        int n = in.nextInt();
        if (n < 0){
            return false;
        } else {
            SumaDeDigitos suma1 = new SumaDeDigitos(n);
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

} // class solution
