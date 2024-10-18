package org.example;

public class Operador_Ternario {
    public void operadores(){
        int a = 1, b = 2, c = 3;
        int resultado = b++ == 2 && c++ < b ? a += b :
                a == 1 && b > c ? a += c :
                        4 - 1 == b && a < b ? (b * c)*5 + 9 : b + c;
        System.out.println(resultado);
    }
}
