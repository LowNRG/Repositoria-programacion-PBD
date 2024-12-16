package org.example;
import java.util.Scanner;

public class sopaLetras {
    public void sopeando() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el número de filas: ");
        int filas = entrada.nextInt();
        System.out.println("Introduce el número de columnas: ");
        int columnas = entrada.nextInt();

        String matriz[][] = new String[filas][columnas];

        // Rellenar la matriz con validación.
        for (int i = 0; i < filas; i++) {
            boolean entradaValida = false;
            while (!entradaValida) {
                System.out.println("Ingresa las letras: ");
                String[] lectura = entrada.nextLine().split("");
                if (lectura.length != columnas) {
                    System.out.println("Error: número de columnas no coincide.");
                } else {
                    boolean valido = true;
                    for (String letra : lectura) {
                        if (!letra.matches("[a-zA-Z]")) {
                            System.out.println("Error: entrada no válida.");
                            valido = false;
                            break;
                        }
                    }
                    if (valido) {
                        matriz[i] = lectura;
                        entradaValida = true;
                    }
                }
            }

            // Mostrar la matriz.
            System.out.println("Matriz ingresada:");
            for (String[] fila : matriz) {
                for (String valor : fila) {
                    System.out.print(valor + " ");
                }
                System.out.println();
            }

            // Pedir la palabra a buscar.
            System.out.println("Introduce la palabra a buscar: ");
            String[] palabra = entrada.next().split("");

            // Validar entrada de la palabra.
            for (String letra : palabra) {
                if (!letra.matches("[a-zA-Z]")) {
                    System.out.println("Error de entrada, pon letras.");
                    return;
                }
            }

            // Búsqueda horizontal.
            boolean encontradaHorizontal = false;
            for (int l = 0; l < filas; l++) {
                for (int j = 0; j <= columnas - palabra.length; j++) {
                    boolean coinciden = true;
                    for (int k = 0; k < palabra.length; k++) {
                        if (!matriz[l][j + k].equals(palabra[k])) {
                            coinciden = false;
                            break;
                        }
                    }
                    if (coinciden) {
                        encontradaHorizontal = true;
                        System.out.println("Palabra encontrada horizontalmente en la fila " + (i + 1) + ", columna " + (j + 1));
                    }
                }
            }

            // Búsqueda vertical.
            boolean encontradaVertical = false;
            for (int j = 0; j < columnas; j++) {
                for (int n = 0; n <= filas - palabra.length; n++) {
                    boolean coinciden = true;
                    for (int k = 0; k < palabra.length; k++) {
                        if (!matriz[n + k][j].equals(palabra[k])) {
                            coinciden = false;
                            break;
                        }
                    }
                    if (coinciden) {
                        encontradaVertical = true;
                        System.out.println("Palabra encontrada verticalmente en la columna " + (j + 1) + ", fila " + (n + 1));
                    }
                }
            }

            if (!encontradaHorizontal && !encontradaVertical) {
                System.out.println("Palabra no encontrada.");
            }
        }
    }
}

