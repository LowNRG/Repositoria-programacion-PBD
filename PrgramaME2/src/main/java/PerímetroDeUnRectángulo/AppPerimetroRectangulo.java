package PerímetroDeUnRectángulo;

public class AppPerimetroRectangulo {

    static java.util.Scanner in;


    public static boolean casoDePrueba() {
        //leer caso de prueba
        int x = in.nextInt();
        int y = in.nextInt();
        if (x < 0 || y < 0){
            return false;
        } else {
            PerimetroRectangulo operacion1 = new PerimetroRectangulo(x, y);
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

} // class solution
