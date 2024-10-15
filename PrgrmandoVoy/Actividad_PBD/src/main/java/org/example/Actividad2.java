package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Actividad2 {
    public void actividad1 () {
        LocalDateTime hoy = LocalDateTime.now();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el modo que quieres usar (1 o 2): ");
        String modo = sc.nextLine();

        int edad = 0;
        switch (modo){
            case "1": {
                System.out.println("Introduce tu año de nacimiento: ");
                String anyoNacimiento = sc.next();
                int anyoNac = 0;
                try {
                    anyoNac = Integer.parseInt(anyoNacimiento);
                } catch (NumberFormatException e) {
                    System.out.println("Error: introducir un numero válido.");
                }
                int añohoy = hoy.getYear();
                if (anyoNac < 1900 || anyoNac > añohoy) {
                    System.out.println("el año introducido no es correcto");
                }
                break;
            }

            case "2": {
                try {
                    System.out.println("Introduce tu edad: ");
                    edad = sc.nextInt();
                    if (edad >= 0) {
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: introuducir un numero válido.");
                }
                break;
            }
        }
        int añohoy = hoy.getYear();
        int año = añohoy - edad;

        if (año >= 1900 && año <= 1928) {
            System.out.println("Sin Generación bautizada");
        } else if (año >= 1928 && año <= 1945) {
            System.out.println("Eres de la generación Silent");
        } else if (año >= 1945 && año <= 1965) {
            System.out.println("Eres Baby Boomer");
        } else if (año >= 1965 && año <= 1982) {
            System.out.println("Eres Generacion X");
        } else if (año >= 1982 && año <= 1995) {
            System.out.println("Eres Generacion Y o Millenial");
        } else if (año >= 1995 && año <= añohoy) {
            System.out.println("Eres Generacion Z o Centennial");
        }else {
            System.out.println("No eres de ninguna generacion");
        }
    }}


