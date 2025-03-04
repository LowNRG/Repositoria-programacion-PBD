package SumaDeDigitos;

import java.util.ArrayList;
import java.util.Collections;

public class SumaDeDigitos {

    int numero;
    private ArrayList<Integer> digitos;

    public SumaDeDigitos(int numero){
        this.numero = numero;
        digitos = new ArrayList<>();
        separarDigitos();
        mostrarNumero();
    }
    public void separarDigitos() {
        try {
            while (numero > 0) {
                int digito = (numero % 10);
                digitos.add(digito);
                numero /= 10;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error, no es un numero");
        }
    }

    public void mostrarNumero() {
        Collections.reverse(digitos);
        int sumado = 0;
        for (int i = 0; i < digitos.size(); i++) {
            System.out.print(digitos.get(i));
            sumado += digitos.get(i);
            if (i < digitos.size() - 1) {
                System.out.print(" + ");
            } else {
                System.out.println(" = " + sumado);
            }
        }
    }

}
