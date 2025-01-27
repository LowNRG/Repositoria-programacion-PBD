import java.util.Scanner;

public class EjerciciosRecursividad {

    static int max = 10;
    public static void main(String[] args){
        int n = 1;
        imprimir(n);
        suma(n);
    }
    public static void imprimir(int n){
        System.out.println(n);
        if(max != n){
            imprimir(n+1);
        }
    }
    public static void suma(int n){
        System.out.println(n);


    }
}

