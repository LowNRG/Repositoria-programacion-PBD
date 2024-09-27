package org.example;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            // Solicitar base del triángulo
            System.out.print("Ingresa la base del triángulo: ");
            double base = scanner.nextDouble();

            // Solicitar altura del triángulo
            System.out.print("Ingresa la altura del triángulo: ");
            double altura = scanner.nextDouble();

            // Calcular el área
            double area = (base * altura) / 2;
            System.out.println("El área del triángulo es: " + area);

            // Preguntar si desea calcular otra área
            System.out.print("¿Quieres calcular otra área? (S/N): ");
            opcion = scanner.next().charAt(0);

        } while (opcion == 'S' || opcion == 's');  // Repite si el usuario ingresa 'S' o 's'

        System.out.println("Fin del programa.");
        scanner.close();
    }
}

