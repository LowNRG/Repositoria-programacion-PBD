package org.example;

import java.util.Scanner;
public class Random {
    public static void random() {
        java.util.Random aleatorio = new java.util.Random();
        int dado1 = aleatorio.nextInt(6) + 1;
        System.out.println("El primer dado saca: " + dado1);
        int dado2 = aleatorio.nextInt(6) + 1;
        System.out.println("El segundo dado saca: " + dado2);
        System.out.println("La suma de los dos dados es: " + (dado1 + dado2));
    }

    public void random2() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int tam = caracteres.length();
        java.util.Random random = new java.util.Random();
        int longitud_contrasenya = (int) (random.nextDouble() * 3 + 6);
        int indice;
        String contrasenya = "";
        for (int i = 0; i < longitud_contrasenya; i++) {
            indice = random.nextInt(tam);
            contrasenya += caracteres.charAt(indice);
        }
        System.out.println("contrasenya = " + contrasenya);
    }

    public void random3() {
        Scanner entrada = new Scanner(System.in);
        java.util.Random random = new java.util.Random();
        System.out.println("introduce el rango minimo: ");
        int min = entrada.nextInt();
        System.out.println("Introduce el rango maximo: ");
        int max = entrada.nextInt();
        int numeroAleatorio = 0;
        if (min < max) {
            System.out.println("Cuantos numeros quieres: ");
            int numeros = entrada.nextInt();
            for (int i = 0; i <numeros; i++) {
                numeroAleatorio = (int) (random.nextDouble() * (max - min + 1)+ min) ;
                System.out.println(numeroAleatorio);
            }
        } else {
            System.out.println("error introduce un min y max validos");
        }

        entrada.close();
    }

}
