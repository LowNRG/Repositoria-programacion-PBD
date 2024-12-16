package org.example;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SeriesMasVistas {
    static Scanner entrada = new Scanner(System.in);

    /**
     * @author - Alberto Planelles
     * @param vuelta - contador para saber en que vuelta del loop estamos
     * @param series - array con los nombres de las series
     * @param tiempos - array con los tiempos de las series
     * @return - devuelve un booleano
     */
    public static boolean casoDePrueba(int vuelta, String[] series, Integer[] tiempos) {
        if (!entrada.hasNextLine()) {
            mostrarTop3(series, tiempos);
            return false;
        }
        else {
            String serie = entrada.nextLine();
            seriesmasvistas(serie, vuelta, series, tiempos);
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        int vuelta = 0;
        String[] series = new String[50]; // Max 50 series
        Integer[] tiempos = new Integer[50];
        while (casoDePrueba(vuelta, series, tiempos)) {
            vuelta++;
        }
    }

    /**
     * Este metodo existe basicamente para ser llamado por el caso de prueba
     * @param serie
     * @param vuelta
     * @param series
     * @param tiempos
     */
    public static void seriesmasvistas(String serie, int vuelta, String[] series, Integer[] tiempos) {
        inputUser(series, tiempos, serie, vuelta);
    }

    /**
     * Este metodo coje la entrada del usuario, la divide en tiempo y serie, lo compara con entradas previas de otras vueltas
        y si el tiempo es mayor a 30 min lo agrega al array.
     * @param serie - El nombre individual de la serie introducida en el input
     */
    public static void inputUser(String[] series, Integer[] tiempos, String serie, int vuelta) {
        String[] partes = serie.split(" ");
        String nombreserie = String.join(" ", Arrays.copyOfRange(partes, 0, partes.length - 1)); //guardar la serie
        int tiempo = Integer.parseInt(partes[partes.length - 1]); // guardar el tiempo

        // Verificar si la serie ya existe
        boolean encontrada = false;
        for (int i = 0; i < vuelta; i++) {
            if (vuelta == 0) {
                break;
            }
            if (series[i] != null && series[i].equals(nombreserie) && tiempo > 30) {
                tiempos[i] += tiempo; // Acumular tiempo
                encontrada = true;
                break;
            }
        }
        // Si no se encontró y el tiempo es mayor a 30, agregar nueva serie
        if (!encontrada && tiempo > 30) {
            series[vuelta] = nombreserie;
            tiempos[vuelta] = tiempo;
        }
    }

    /**
     * En este metodo ordenamos el array del tiempo en una copia para saber los mas altos y su respectiva posicion en el array original
      para poder compararlo con la posicion del nombre de la serie en el array
     * @param series
     * @param tiempos
     */
    public static void mostrarTop3(String[] series, Integer[] tiempos) {
        Integer[] copiatiempo = Arrays.copyOf(tiempos, 50);
        Arrays.sort(copiatiempo, Collections.reverseOrder());
        int tiempo1 = copiatiempo[0];
        int tiempo2 = copiatiempo[1];
        int tiempo3 = copiatiempo[2];

        String serie1 = "";
        String serie2 = "";
        String serie3 = "";

        for(int i =0; i<series.length;i++){
            if(tiempos[i] == tiempo1){
                serie1 = series[i];
            }else if(tiempos[i] == tiempo2){
                serie2 = series[i];
            }else if(tiempos[i] == tiempo3){
                serie3 = series[i];
            }
        }
        System.out.println(serie1 + "/n" + serie2 + "/n" + serie3);

    }
}
