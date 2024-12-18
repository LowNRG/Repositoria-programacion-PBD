package org.example;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class horchataME {
    static Scanner entrada  = new Scanner (System.in);
    public static boolean casoDePrueba(Integer[] trabajado, int[] pedido,int availablehorchata) {
        String horchata = entrada.nextLine();
        if ("0 0".equals(horchata)) {
            return false;
        } else {
            horchataquequeda(horchata);
            calculando(trabajado,pedido, availablehorchata);
            return true;
        }
    } // casoDePrueba

    public static void main(Integer[] trabajado, int[] pedido,int availablehorchata) {
        while (casoDePrueba(trabajado,pedido, availablehorchata)) {
        }
    }
    public static void horchataquequeda(String horchata) {
        String[] dividido = horchata.split(" ");
        int availablehorchata = Integer.parseInt(dividido[0]);
        int ppl = Integer.parseInt(dividido[1]);
        Integer[] trabajado = new Integer[50];
        int[] pedido = new int[50];
        for (int i = 0; i < ppl; i++) {
            String clientes = entrada.nextLine();
            String[] dividido2 = clientes.split(" ");
            trabajado[i] = Integer.parseInt(dividido2[0]);
            pedido[i] = Integer.parseInt(dividido2[1]);
        }

    }
    public static void calculando (Integer[] trabajado, int[] pedido,int availablehorchata){
        Integer[] ordenadito = Arrays.copyOf(trabajado, trabajado.length);
        Arrays.sort(ordenadito, Collections.reverseOrder());
        int personas=0;
        int horchataleft = availablehorchata;
        for (int i = 0; i < trabajado.length; i++) {
            for (int j = 0; j < trabajado.length; j++) {
                if (trabajado[j].equals(ordenadito[i])) {
                    if (horchataleft >= pedido[j]) {
                        horchataleft -= pedido[j];
                        personas++;
                    }
                    break;
                }
            }
        }
        System.out.println(personas + horchataleft);


    }

}

