package org.example;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Ruleta {
    public void Rueleteo(String args) {
        Scanner entrada = new Scanner(System.in);
        String colores[] = {"rojo", "negro"};
        Integer numeros[] = new Integer[37];
        String valores[] = {"par", "impar"};
        System.out.println("Introduce un numero (0-36): ");
        int input = entrada.nextInt();

        boolean numero_encontrado = Arrays.asList(numeros).contains(input);
        if(!numero_encontrado) {
            System.out.println("Error no esta en el rango valido");
        }else {
            if (input!=0) {
                System.out.println("Introduce un color: ");
                String input2 = entrada.nextLine();
                boolean color_encontrado = Arrays.asList(colores).contains(input2.toLowerCase());
                if (!color_encontrado){
                    System.out.println("Error, el color no es valido");
                    return;
                }else{
                    System.out.println("inserte par/impar: ");
                    String par = entrada.next();
                    boolean par_encontrado = Arrays.asList(valores).contains(par);
                    if(!par_encontrado){
                        System.out.println("Error, la opcion par/impar no es valida ");
                    }
                }
            }
        }
        Random aleatorio = new Random();
        String sorteo_color = colores[aleatorio.nextInt(colores.length)];
        int sorteo_numero = numeros[aleatorio.nextInt(numeros.length)];
        String sorteo_par = "";
        

    }

}

