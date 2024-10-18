package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculadora {
    public void calculando() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a mi calculadora");
        System.out.println("Introduce el primer operando: ");
        int operando1 = 0;
        boolean operandoValido = false;
        while (!operandoValido) {
            try {
                if (entrada.hasNextInt()) {
                    operando1 = entrada.nextInt();
                    if (operando1 <= 0) {
                        throw new IllegalArgumentException("Error: No se permiten números negativos o cero.");
                    }
                    operandoValido = true;
                } else {
                    throw new InputMismatchException("Error: Entrada no válida. Debes introducir un número ");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                entrada.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        String signo = "";
        boolean signoValido = false;
        while (!signoValido) {
            System.out.println("Elige la operacion a realizar: '+' '-'  '/'  'x'  'R'");
            try {
                signo = entrada.next();
                if (!signo.equals("+") && !signo.equals("-") && !signo.equals("x") && !signo.equals("/") && !signo.equals("R")) {
                    throw new IllegalArgumentException("Signo no válido. Usa +, -, x, /, o R");
                }
                signoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Introduce el segundo operando: ");
            int operando2 = 0;
            boolean operando2Valido = false;
            while (!operando2Valido) {
            try {
                if (entrada.hasNextInt()) {
                    operando2 = entrada.nextInt();
                    if (operando2 <= 0) {
                        throw new IllegalArgumentException("Error: No se permiten números negativos o cero.");
                    }
                    operando2Valido = true;
                } else {
                    throw new InputMismatchException("Error: Entrada no válida. Debes introducir un número ");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                entrada.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("El resultado es ");
            switch (signo) {
                case "+":
                    System.out.println(operando1 + operando2);
                    break;
                case "-":
                    System.out.println(operando1 - operando2);
                    break;
                case "/":
                    if(operando2 >0) {
                        System.out.println(operando1 / operando2);
                    }else{
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case "x":
                        System.out.println(operando1 * operando2);
                    break;
                case "R":
                        System.out.println(Math.sqrt(operando1));
                    break;
                default:
                    System.out.println("Error");


            }



        }
    }
