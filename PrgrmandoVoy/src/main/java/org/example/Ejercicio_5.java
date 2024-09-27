package org.example;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int numero3 = scanner.nextInt();

        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
            System.out.println("ERROR: hay números introducidos que son iguales.");
        } else {
            int minimo = Math.min(numero1, Math.min(numero2, numero3));
            System.out.println("El mínimo de los tres números es: " + minimo);
        }

        scanner.close();
    }
}
