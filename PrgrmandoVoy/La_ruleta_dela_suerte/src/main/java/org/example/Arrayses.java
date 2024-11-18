package org.example;
import java.util.Arrays;
import java.util.Random;

public class Arrayses {
    public void Vectorcitos(String args) {
        int vector[] = {1, 1, 2, 2, 3, 4, 8, 9};
        System.out.println(Arrays.toString(vector));
        int tam=8;
        int auxiliar[] = new int[vector.length];
        int sin_duplicados[] = new int[tam];
        for (int i = 0; i < vector.length - 1; i++) {
            if (i != 0 && vector[i] == vector[i + 1]) {
                continue;
            } else {
                auxiliar[i] = vector[i];
            }

        }
        int pos = 0;
        for (int i = 0; i < auxiliar.length; i++) {
            if (auxiliar[i] != 0) {
                sin_duplicados[pos] = auxiliar[i];
                pos++;
            }
        }
        System.out.println(Arrays.toString(auxiliar));

    }
    public void Vectorictos(){

    }
    public void vectorcitos3(){
        int sorteo[] = new int[6];
        Random aleatorio = new Random();
        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = aleatorio.nextInt(49) + 1;
        }
        System.out.println(Arrays.toString(sorteo));
        Arrays.sort(sorteo);

        boolean ordenados_duplicados = true;
        while(ordenados_duplicados) {
            ordenados_duplicados =false;
            for (int i = 0; i < sorteo.length; i++) {
                if (i != sorteo.length - 1 && sorteo[i] == sorteo[i + 1]) {
                    System.out.println("duplicado: " + sorteo[i]);
                    System.out.println(Arrays.toString(sorteo));
                    sorteo[i] = aleatorio.nextInt(49) + 1;
                    ordenados_duplicados=true;
                }
            }
            Arrays.sort(sorteo);
        }


    }
    public void prueba_distinct(){
        int original[]={1,1,2,2,3,4,9,9};
        int limpio[]= Arrays.stream(original).distinct().toArray();
        System.out.println(Arrays.toString(limpio));
    }
}
