import java.util.Scanner;
public class Bateria_Recursividad {
    public static Scanner entrada = new Scanner(System.in);
    static char palabra_vector[];
    public static void main(String[] args) {
        boolean continuar = true;
        while(continuar) {
            menu();
            continuar = returnmenu();
        }
    }

    public static void menu() {
        System.out.println("Selecciona a continuacion el modo que quieras ejecutar...");
        System.out.println(" 1 - Digitos \n 2 - Potencias \n 3 - Del Revés \n 4 - Binario \n 5 - A Binario \n 6 - Orden alfabético \n 7 - Mostrar suma \n  ");
        int eleccion = inputusernum();
        switch (eleccion) {
            case 1:
                System.out.println("Te dire cuantos digitos tiene tu numero!");
                System.out.println(digitos(inputusernum()));
                break;
            case 2:
                System.out.println("Dime base y potencia y te elevare el numero!");
                System.out.println("Base: ");
                int base = inputusernum();
                System.out.println("Exponente: ");
                int exponente = inputusernum();
                System.out.println(potencias(base, exponente));
                break;
            case 3:
                System.out.println("Dame una palabra: ");
                palabra_vector = inputuserword().toCharArray();
                invertir_palabra(palabra_vector.length);
                System.out.println("Dame un numero: ");
                numero_invertido(inputusernum());
                break;
            case 4:
                System.out.println("Te puedo decir si el numero que introduzcas es binario o no con mis poderes");
                if(binario(inputusernum())){
                    System.out.println("Es binario");
                }else{
                    System.out.println("No es binario");
                }
            case 5:
                System.out.println("Te convierto magicamente el numero en binario");
                System.out.println("El numero en binario es " + binarioador(inputusernum()));
            case 6:
                System.out.println("Introduce una palabra y te digo si esta ordenada alfabeticamente: ");
                ordenalfabetizador(inputuserword());
            case 7:
        }
    }

    public static int inputusernum() {
        System.out.println("Introduce numero: ");
        int input=-1;
        try{
            input = entrada.nextInt();
        }catch(NumberFormatException e){
            System.out.println("Introduce un numero correcto ");
        }
        return input;
    }
    public static String inputuserword(){
        System.out.println("Introduce palabra: ");
        String input = " ";
        try{
            input = entrada.nextLine();
            entrada.nextLine();
        }catch(Exception e){
            System.out.println("Introduce una palabra correcta ");
            entrada.nextLine();
        }
        return input;
    }

    public static boolean returnmenu() {
        System.out.println("Elige una opción: \n [M] - Volver al menu principal \n [X] - Salir");
        String answer = entrada.nextLine().toUpperCase();
        return answer.equals("M");
    }

    public static int digitos(int numero) {
        int contador = 0;

        if (numero == 0) {
            return 0;
        } else {
            while (numero != 0) {
                numero /= 10;
                contador++;
            }
        }
        return contador;

    }
    public static int potencias(int base, int exponente){

        if(exponente==0){
            return 1;
        }

        return base*potencias(base,--exponente);
    }
    public static void numero_invertido(int numero){

        if(numero>=0 && numero <10){
            System.out.print(numero);
        }else{
            System.out.print(numero%10);
            numero_invertido(numero/10);
        }
    }
    public static void invertir_palabra(int contador){

        if (contador ==0){
            System.out.println(palabra_vector[contador]);
        }else{
            System.out.println(palabra_vector[contador]);
            invertir_palabra((contador-1));
        }
    }
    public static boolean binario(int numero){
        if(numero>9) {
            if (numero % 10 == 0 || numero % 10 == 1) {
                return binario(numero / 10);
            } else {
                return false;
            }
        }
        return numero==0 || numero==1;

    }
    public static int binarioador(int numero){

        if(numero==0|| numero==1){
            return numero;
        }else{
            return numero%2+10*binarioador(numero/2);
        }
    }
    public static boolean ordenalfabetizador(String palabra){
        if (palabra.length() <= 1) {
            return true;
        }
        if (palabra.charAt(0) > palabra.charAt(1)) {
            return false;
        }
        return ordenalfabetizador(palabra.substring(1));
    }
}