package org.example;

import java.util.Scanner;

public class NumeroSuerte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa:");
        String fecha = scanner.nextLine();

        String[] partes = fecha.split("/");  // Divide la fecha por "/"
        int dia = Integer.parseInt(partes[0]);  // Convertir el día a entero
        int mes = Integer.parseInt(partes[1]);  // Convertir el mes a entero
        int anio = Integer.parseInt(partes[2]); // Convertir el año a entero

        System.out.println(dia, " + " + mes, " + "+ anio = (int sumanio));
        int i = 0;
        if (sumanio =>0 ) {
            System.out.println( sumanio/10, "+" ,sumanio/100, "+" ,sumanio/1000 = int resultado);
        }
        int sumaTotal = dia + mes + anio;

        // 5. Sumar las cifras de la suma total
        int numeroSuerte = sumarCifras(sumaTotal);

        // 6. Mostrar el número de la suerte
        System.out.println("Tu número de la suerte es: " + numeroSuerte);
    }

    // Función que suma las cifras de un número hasta obtener un solo dígito
    public static int sumarCifras(int numero) {
        int suma = 0;
        // Mientras el número tenga más de una cifra, seguir sumando
        while (numero > 0) {
            suma += numero % 10;  // Agregar la última cifra del número
            numero /= 10;         // Eliminar la última cifra
        }
        // Si la suma tiene más de una cifra, repetir el proceso
        if (suma >= 10) {
            return sumarCifras(suma);
        } else {
            return suma;
        }
    }
}
