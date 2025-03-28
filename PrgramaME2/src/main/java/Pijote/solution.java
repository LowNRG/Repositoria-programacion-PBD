package Pijote;

public class solution { // Asume fichero llamado solution.java

    static java.util.Scanner in;

    public static void casoDePrueba() {
        ElPijote elPijote = new ElPijote(in.nextInt());

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} // class solution