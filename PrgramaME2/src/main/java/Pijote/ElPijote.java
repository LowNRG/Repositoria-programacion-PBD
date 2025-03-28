package Pijote;

import java.util.ArrayList;

public class ElPijote {

    private int numero;
    private ArrayList<Integer> listadigitos;
    private ArrayList<Integer> repetidos;

    public ElPijote(int numero) {
        this.numero = numero;
        listadigitos = new ArrayList<>();
        repetidos = new ArrayList<>();
        compararDigitos();
    }
    private void separarDigitos() {
        int n = numero;
        while (n > 0) {
            listadigitos.add(n % 10);
            n = n / 10;
        }
    }
    private void compararDigitos() {
        separarDigitos();
        int n = listadigitos.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (listadigitos.get(i) == listadigitos.get(j)) {
                    repetidos.add(listadigitos.get(j));
                }
            }
        }
        if(repetidos.size()==listadigitos.size()/2|| !repetidos.isEmpty()) {
            System.out.println("SUBNORMAL");
        }else {
            System.out.println("NO SUBNORMAL");
        }
    }

}

