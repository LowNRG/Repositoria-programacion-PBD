package Practicas;
import java.util.Scanner;

public class Practica_3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre al usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();  // Guardar el nombre en una variable tipo String
        int edad;
        do {//abrimos bucle para confirmar que la edad no es negativa

            // Saludar al usuario y pedir la edad
            System.out.print("Hola " + nombre + ". Introduce tu edad: ");
             edad = scanner.nextInt(); // Guardar la edad en una variable tipo int
        } while (edad < 0);

        // Verificar si la persona es apta para votar
        if (edad >= 18) {
            // Si la edad es mayor o igual a 18, es apto para votar
            System.out.println("Enhorabuena " + nombre + ". Puedes votar.");
        } else {
            // Si la edad es menor a 18, no es apto para votar
            System.out.println("Lo siento " + nombre + ". No puedes votar.");
            int aniosParaVotar = 18 - edad;  // Calcular cuántos años le faltan
            System.out.println("Te faltan " + aniosParaVotar + " años para ser mayor de edad.");
        } //prueba

        // Cerrar el scanner
        scanner.close();
    }
}
