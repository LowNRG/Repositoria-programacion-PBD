package org.example;
import java.util.Random;
import java.util.Scanner;
public class CarayCruz {
    public static void caracruz(){
        mostrarOpciones();
        String opcion_usuario = recogerOpcion();
        String opcion_sorteo = sorteo();
        comprobar_Resultado(opcion_usuario,opcion_sorteo);
    }

    public static void mostrarOpciones(){
        System.out.println("BIENVENIDO");
        System.out.println("Elige tu opcion: ");
        System.out.println("  c - cara");
        System.out.println("  x - cruz");

    }
    public static String recogerOpcion(){
        Scanner teclado = new Scanner(System.in);
        String opcion = teclado.next();
        return opcion;
    }
    public static String sorteo(){
        Random aleatorio = new Random();
        String opciones[] = {"cara", "cruz"};

        String sorteo = opciones[aleatorio.nextInt(2)];

        return sorteo;

    }
    public static void comprobar_Resultado(String opcion, String sorteo){
        if(opcion.equals(sorteo)){
            System.out.println("Has ganado! Ha salido: " + sorteo);
        }else{
            System.out.println("Has perdido! Ha salido: " + sorteo);
        }

    }
}
