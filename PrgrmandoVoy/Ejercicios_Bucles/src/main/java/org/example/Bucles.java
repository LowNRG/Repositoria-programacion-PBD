package org.example;

import java.util.Scanner;

public class Bucles {
    public void Ejercicio1() {
        Scanner entrada = new Scanner(System.in);
        String clave = "patateando";
        String pas_usuario;
        do {
            System.out.println("introduce tu contraseña:");
            pas_usuario = entrada.next();

        }while(!pas_usuario.equals(clave));


    }
    public void Ejercicio2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce tu numero: ");
        int num = entrada.nextInt();
        for(int i = num; i >=1; i--){
            System.out.println(i);
        }

    }
    public void Ejercicio3() {

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    public void Ejercicio4(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce una palabra: ");
        String palabra = entrada.nextLine();
        for (int i = 0; i < palabra.length(); i++){
            System.out.println(palabra.charAt(i));
        }


    }
    public void Ejercicio5(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número para saber su tabla de multiplicar: ");
        int num = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x" + i + " = " + (num * i));
        }
    }
    public void Ejercicio6(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = entrada.nextInt();
        int suma = 0;
        for (int n = 1; n <= num+1; n++) {
            System.out.println("introduce nº" + n + ":");
            int input = entrada.nextInt();
            suma +=input;
        }
        System.out.println("El resultado de la suma es: " + suma);
    }
    public void Ejercicio7(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce un numero para calcular el factorial: ");
        int num= entrada.nextInt();
        int factorial = 1;
        for (int i=1; i<=num; i++){
            factorial *= i;
        }
        System.out.println("El factorial del numero " + num + " es " + factorial);

    }
    public void Ejercicio8(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = entrada.next();

        String inversion= "";
        for(int i = cadena.length() -1; i>=0; i--){
            inversion += cadena.charAt(i);
        }
        System.out.println(inversion);
    }
}
