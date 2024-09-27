package org.example;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numerador: ");
        double numerador = scanner.nextDouble();

        System.out.print("Introduce el divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("ERROR: no se puede dividir entre 0.");
        } else {
            double resultado = numerador / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        }

        scanner.close();
    }
}
