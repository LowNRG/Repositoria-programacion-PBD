

import java.util.Scanner;
public class Pre_Examen {
    public void Ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cantidad de numeros: ");
        int n = entrada.nextInt();
        int masquezero= 0;
        int menosquezero = 0;
        int igualquezero = 0;
        for (int i = 0; i <n; i++){
            System.out.println("Introduce un número: ");
            int numero = entrada.nextInt();
            if (numero>0){
                masquezero++;
            }else if (numero <0){
                menosquezero++;
            }else{
                igualquezero++;
            }
        }
        System.out.println("la cantidad de numeros mayores que 0 es: " + masquezero);
        System.out.println("la cantidad de numeros menores que 0 es: " + menosquezero);
        System.out.println("la cantidad de numeros iguales que 0 es: " + igualquezero);
    }
    public void Ejercicio2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduce otro numero: ");
        int num2 = entrada.nextInt();
        int resultado = 0;
        for(int i=0; i<=num2; i++){
            resultado = i*(num1 * num1);
        }
        System.out.println("El resultado es: " + resultado);
    }
    public void Ejercicio3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce cuantos meses lo has financiado: ");
        int meses = entrada.nextInt();
        System.out.println("Financiacion a " + meses + " meses");
        int mensual = 10;
        int pagototal =0;
        for (int i = 1; i <= meses;i++){
            System.out.println("Mes " + i + ": " + mensual + "€");
            mensual = mensual * 2;
            pagototal += mensual;
        }
        System.out.println("Total a pagar: " + pagototal + "€");
    }
    public void Ejercicio4(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nota: ");
        int nota = entrada.nextInt();
        if (nota>10 || nota<0){
            System.out.println("No valido");
        }else{
            switch (nota){
                case 0,1,2,3,4:
                    System.out.println("INSUFICIENTE");
                    break;
                case 5:
                    System.out.println("SUFICIENTE");
                    break;
                case 6:
                    System.out.println("BIEN");
                    break;
                case 7,8:
                    System.out.println("NOTABLE");
                    break;
                case 9,10:
                    System.out.println("SOBRESALIENTE");
                    break;
            }
        }
    }
    public void Ejercicio5(){
        Scanner entrada = new Scanner(System.in);
        int maxsueldo = 0;
        int mileuristas = 0;
        for(int i=0; i<5; i++){
            System.out.println("Introduce los sueldos: ");
            int sueldo = entrada.nextInt();
            if (sueldo>maxsueldo) {
                maxsueldo=sueldo;
            }
            if (sueldo>1000){
                mileuristas++;
            }
        }
        System.out.println("El sueldo maximo es: "+ maxsueldo);
        System.out.println("La cantidad de mileuristas es: " + mileuristas);

    }
    public void Ejercicio6() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos alumnos quieres medir: ");
        int N = entrada.nextInt();
        int mayores = 0;
        int altura = 0;
        int media=0;
        int media2=0;
        for (int i = 0; i < N; i++) {
            System.out.println("introduce la edad: ");
            int edad = entrada.nextInt();
            System.out.println("introduce la estatura: ");
            int mide = entrada.nextInt();
            if (edad > 18) {
                mayores++;
            }
            if (mide >175){
                altura++;
            }
            media += edad;
            media2 += mide;
        }
        if ( N >0){
            int edadmedia = media / N;
            int alturamedia = media2 /N;
            System.out.println("La media de edad es: " + edadmedia);
            System.out.println("la altura media es: " + alturamedia);
        }else{
            System.out.println("Error introduce una cantidad valida");
        }
        System.out.println("La cantidad de alumnos mayores de 18 es: " + mayores);
        System.out.println("Los mas altos de 175cm son: " + altura);


    }
    public void Ejercicio7() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres: ");

        if (entrada.hasNextInt()) {
            int n = entrada.nextInt();

            if (n <= 0) {
                System.out.println("Introduce un numero positivo.");
                return;
            }

            int a = 0;
            int b = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }

        } else {
            System.out.println("Introduce un numero valido.");
        }
    }


}


