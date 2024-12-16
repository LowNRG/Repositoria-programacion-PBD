package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class BateriaMetodos {

    public static void ejercicio1(){
        int num= input();
        int resultado = operacion(num);
        System.out.println(resultado);
    }
    public static int input(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = entrada.nextInt();
        return numero;
    }
    public static int operacion(int input){
        int resultado = input*input*input;
        return resultado;
    }

    public static void ejercicio2(){
        Scanner entrada = new Scanner(System.in);
        String[] menu = {"Home", "Apps","Products", "contact", "Exit"};
        System.out.println(Arrays.toString(menu));
        String input = entrada.nextLine();
        if (comprobacion(menu, input)) {
            System.out.println("Continuando a " + input + " un segundo por favor");
        }
    }
    public static boolean comprobacion(String[] menu, String input){
        for (String palabras : menu) {
            if (palabras.equals(input)) {
                if (palabras.equalsIgnoreCase(menu[4])){
                    System.out.println("Saliendo del programa...");
                    break;
                }
                return true;
            }
        }
        return false;

    }

    

    public static class ejercicio4 {
        static Scanner teclado;
        public static void main(String[] args) {
            teclado = new Scanner(System.in);
            while (casoDePrueba()){
            }
        }
        public static boolean casoDePrueba(){
            float dato = teclado.nextFloat();
            if(dato == -1){
                return false;
            }else{
                float semana[] = rellenarDatos(dato);
                System.out.println("---");
                return true;
            }
        }
        public static float[] rellenarDatos(float dato){
            float datos[] = new float[6];
            datos[0] = dato;
            for (int i =0; i<datos.length;i++){
                datos[i]= teclado.nextFloat();

            }
            return datos;
        }
    }
}
