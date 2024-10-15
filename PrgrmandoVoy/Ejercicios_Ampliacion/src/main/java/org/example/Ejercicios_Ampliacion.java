package org.example;
import java.util.Scanner;
public class Ejercicios_Ampliacion {
    public void Ejercicios_Ampliacion1(){
        System.out.println("Introduce tu altura: ");
        Scanner entrada=new Scanner(System.in);
        if (Scanner.hasNextInt()){

        }
        int altura = entrada.nextInt();
        if (altura<= 150){
            System.out.println("Persona de altura baja.");
        }else if (altura>= 151 && altura<=175) {
            System.out.println("Persona de altura media.");
        }else if (altura>=175){
            System.out.println("Persona alta");

        }

    }
    public void Ejercicios_Ampliacion2(){
        System.out.println("introduce un numero entre 1 y 7: ");
        Scanner entrada=new Scanner(System.in);
        int num = entrada.nextInt();
        switch(num){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
        }

    }
}
