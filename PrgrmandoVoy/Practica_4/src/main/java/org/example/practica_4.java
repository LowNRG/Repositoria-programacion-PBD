package org.example;
import java.util.Scanner;

public class practica_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplicando = 0;
        int multiplicador = 0;

        try {
            System.out.print("Introduce el multiplicando (tres cifras): ");
            multiplicando = Integer.parseInt(scanner.nextLine());

            if (multiplicando < 100 || multiplicando > 999) {
                throw new NumberFormatException("El número debe tener tres cifras.");
            }
            System.out.print("Introduce el multiplicador (tres cifras): ");
            multiplicador = Integer.parseInt(scanner.nextLine());

            if (multiplicador < 100 || multiplicador > 999) {
                throw new NumberFormatException("El número debe tener tres cifras.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        int unidades = multiplicador % 10;
        int decenas = (multiplicador / 10) % 10;
        int centenas = multiplicador / 100;

        int resultadoUnidades = multiplicando * unidades;
        int resultadoDecenas = multiplicando * decenas;
        int resultadoCentenas = multiplicando * centenas;

        int productoFinal = resultadoUnidades + (resultadoDecenas * 10) + (resultadoCentenas * 100);
        System.out.println("el producto de la multiplicacion es: " + productoFinal);
        System.out.println("el proceso es:");
        System.out.println("    " + multiplicando);
        System.out.println("  x " + multiplicador);
        System.out.println("  ------");
        System.out.println("   " + resultadoUnidades);
        System.out.println("  " + (resultadoDecenas * 10));
        System.out.println("+ " + (resultadoCentenas * 100));
        System.out.println("  ------");
        System.out.println("  " + productoFinal);
    }
}
