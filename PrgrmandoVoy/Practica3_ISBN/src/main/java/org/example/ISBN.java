package org.example;
import java.util.Scanner;
public class ISBN {
    public void practica3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el ISBN: ");
        String isbn = entrada.nextLine();
        if (isbn.length() != 10) {
            System.out.println("Error ISBN incorrecto.");
            return;
        }
        int sum = 0;
        boolean interrogation = false;
        int multiplo = 0;
        int numeroqfalta = -1;
        for (int i = 0; i < 9; i++) {
            char letraactual = isbn.charAt(i);
            if (letraactual == '?') {
                multiplo = 10 - i;
                interrogation = true;
            } else {
                int n = Integer.parseInt(isbn.substring(i, i + 1));
                sum += n * (10 - i);

            }
        }
        char ultimo = isbn.charAt(9);
            if (ultimo == 'X') {
                sum += 10;
            }else if (ultimo == '?' ) {
                interrogation = true;
                multiplo = 1;

                } else {
                int n = Integer.parseInt(isbn.substring(9,10));
                sum += n;
            }
            if (interrogation){
                numeroqfalta = (11 - (sum & 11)) % 11;
                if(numeroqfalta == 10) {
                    System.out.println("Falta una X");
                }else{
                    System.out.println("El digito que falta es " + numeroqfalta);
                }
            }
            boolean valido = (sum % 11 == 0);
        System.out.println(valido ? "ISBN válido." : "ISBN no valido");
        entrada.close();
    }
}