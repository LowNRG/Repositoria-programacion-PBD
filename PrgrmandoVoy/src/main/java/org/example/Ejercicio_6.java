package org.example;
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Tienes tomate? (si/no): ");
        String tieneTomate = scanner.nextLine().toLowerCase();

        System.out.print("¿Tienes aceite? (si/no): ");
        String tieneAceite = scanner.nextLine().toLowerCase();

        System.out.print("¿Tienes jamón? (si/no): ");
        String tieneJamon = scanner.nextLine().toLowerCase();

        if (tieneTomate.equals("no") || tieneAceite.equals("no") || tieneJamon.equals("no")) {
            System.out.println("¡Tenemos que ir a comprar!");
        } else {
            System.out.println("¡No tenemos que ir a comprar!");
        }
        
        scanner.close();
    }
}
