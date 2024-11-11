import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Vectores{
    public void Ejercicio1() {
        int[] array = new int[8];
        int suma = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(501);
            suma += array[i];
        }
        System.out.println("Los elementos del array son:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("La suma de los elementos es: " + suma);
    }
    public void Ejercicio2() {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];
        System.out.println("Introduce los numeros a invertir: ");
        for (int i=0; i<numeros.length;i++){
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Numeros invertidos: ");
        for (int i =numeros.length-1;i>=0;i--){
            System.out.print(" " + numeros[i] + " ");
        }
    }
    public void Ejercicio3(){
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[25];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101);
        }
        System.out.println("Ingresa un número para buscar [0,100]: ");
        int num = 0;
        do{
            if (entrada.hasNextInt()) {
                num = entrada.nextInt();
            }else{
                System.out.println("Introduce un formato valido.");
                entrada.nextLine();
            }
        }while(num<0 || num>100);
        int contador = 0;
        for (int i =0; i<numeros.length;i++){
            if (num==numeros[i]){
                contador++;
            }
        }
        System.out.println("El número "+ num + " aparece " + contador + " veces en el array.\n");
    }
    public void Ejercicio4(){
        Scanner entrada = new Scanner(System.in);
        int numeros[] = {1,3,5,7,9};
        System.out.println("Array original: "+ java.util.Arrays.toString(numeros));
        System.out.println("Ingresa el indice a eliminar : ");
        int n = entrada.nextInt();
        if (n < 0 || n >= numeros.length) {
            System.out.println("Índice no válido.");
            return;
        }
        int [] clonado = numeros.clone();
        for(int i = n; i < clonado.length-1; i++){
            clonado[i]= clonado[i+1];
        }
        int [] resultado = new int[clonado.length-1];
        System.arraycopy(clonado,0, resultado, 0, resultado.length);
        System.out.println("Arrays despues de eliminar el indice " + n + ":" + java.util.Arrays.toString(resultado));

    }
    public void Ejercicio5(){
        int[] array = {1,2,3,4,5};
        System.out.println("Array original: " + java.util.Arrays.toString(array));
        int ultimo = array[array.length-1];
        for(int i = array.length-1; i>0;i--){
            array[i] = array[i-1];
        }
        array[0] =ultimo;
        System.out.println("Array rotado: " + java.util.Arrays.toString(array));
    }
    public void Ejercicio6() {
        int[] numeros = {1, 2, 3, 2, 1};
        System.out.println("Array: " + java.util.Arrays.toString(numeros));
        int inicio = 0;
        int fin = numeros.length - 1;
        boolean esSimetrico = true;
        while (inicio < fin) {
            if (numeros[inicio] != numeros[fin]) {
                esSimetrico = false;
                break;
            }
            inicio++;
            fin--;
        }
        if (esSimetrico) {
            System.out.println("Es simétrico: SÍ");
        } else {
            System.out.println("Es simétrico: NO");
        }
    }
    public void Ejercicio7() {
        int array1[] = {1, 2, 3, 4};
        int array2[] = {5, 6, 7, 8};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int[] combinado = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, combinado, 0, array1.length);

        System.arraycopy(array2, 0, combinado, array1.length, array2.length);
        System.out.println(Arrays.toString(combinado));
    }
    public void Ejercicio8(){
        int array1[] = {1,2,3,5};
        System.out.println(Arrays.toString(array1));
        int[] resultante= new int[5];
        System.arraycopy(array1, 0, resultante, 0, 3 );
        resultante[3]=4;
        System.arraycopy(array1,3, resultante, 4, 1);
        System.out.println(Arrays.toString(resultante));
    }
    public void Ejercicio9(){
        String[] nombres = {"Paco", "Jose", "Antonio", "Pedro", "Gerardo"};
        System.out.println(Arrays.toString(nombres));
        String nombremaslargo="";
        for(String nombre : nombres){
            if(nombre.length()>nombremaslargo.length()){
                nombremaslargo = nombre;
            }
        }
        System.out.println("La palabra mas larga es : " + nombremaslargo);
    }
    public void Ejercicio10(){
        String[] palabras = {"pedro", "queso", "lofi","beat", "shorty", "space", "loki", "freak", "ultimate", "best", "adios"};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una letra: ");
        String letra = entrada.nextLine();
        boolean encontrada = false;

        for (String palabra : palabras) {
            String primeraLetra = String.valueOf(palabra.charAt(0));

            if (primeraLetra.equals(letra)) {
                System.out.println("Palabra encontrada: " + palabra);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se ha encontrado ninguna palabra que comience con esa letra.");
        }
    }
}

