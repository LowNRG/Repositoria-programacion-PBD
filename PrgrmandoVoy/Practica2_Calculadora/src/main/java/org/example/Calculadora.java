package org.example;
import java.util.Scanner;
public class Calculadora {
    public void calculando(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Bienvenido a mi calculadora");
        System.out.println("Introduce el primer operando: ");
        int operando1 = entrada.nextInt();
        if (Scanner.hasNextInt()) {
        }else{
            System.out.println("Introduce un numero válido");
        }
        System.out.println("Elige la operacion a realizar: ");
        System.out.println(" '+' '-'  '/'  'x'  'R' ");
        String signo = entrada.nextLine();
        System.out.println("Elige el segundo operando: ");
        int operando2 = entrada.nextInt();
        if (Scanner.hasNextInt()) {
        } else {
            System.out.println("Introduce un numero válido");
        }
        switch(signo){
            case "+":
                System.out.println(operando1 + operando2);
                break;
            case "-":
                System.out.println(operando1 - operando2);
                break;
            case "/":
                System.out.println(operando1 / operando2);
                break;
            case "x":
                System.out.println(operando1 * operando2);
                break;
            case "R":
                System.out.println(Math.sqrt(operando1));
                break;
            default:
                System.out.println("Te colaste manin");




        }


    }
}
