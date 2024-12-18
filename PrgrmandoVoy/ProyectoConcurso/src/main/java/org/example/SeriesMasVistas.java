package org.example;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SeriesMasVistas {
    static Scanner entrada = new Scanner(System.in);

    /**
     * @author - Alberto Planelles
     * @param vuelta - contador para saber en que vuelta del loop estamos
     * @param series - nuevo array con los nombres de las series
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

    /**
     *
     */
    public static void main(String[] args) { // Ajustar firma del main
        int vuelta = 0;
        String[] series = new String[50]; // Max 50 series
        Integer[] tiempos = new Integer[50];

        while (true) {
            if (!casoDePrueba(vuelta, series, tiempos)) {
                break;
            }
            vuelta++;
        }
    }


    /**
     * Este metodo existe basicamente para ser llamado por el caso de prueba
     * @param serie debemos llamar a serie pues esta dentro del metodo de inpuUser y es la entrada del usuario
     * @param vuelta el contador vuelta para indicar en que loop estas
     * @param series el array lleno del nombre de la serie introducida
     * @param tiempos el array lleno del tiempo introducido mayor de 30 y acumulado en serie introducida igual
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
     * @param series en este metodo el array esta lleno de nombres de series y es rankeado por sus tiempos acumulados correspondientes
     * @param tiempos creo una copia y ordena el array de forma descendiente para saber en que posicion esta la series correspondiente en el array original
     */
    public static void mostrarTop3(String[] series, Integer[] tiempos) {
        Integer[] copiatiempo = Arrays.copyOf(tiempos, 50);
        Arrays.sort(copiatiempo, Collections.reverseOrder());

        int top = 0;
        for (int i = 0; i < copiatiempo.length && top < 3; i++) {
            if (copiatiempo[i] == null || copiatiempo[i] == 0) {
                continue; // Ignorar tiempos nulos o cero
            }
            for (int j = 0; j < tiempos.length; j++) {
                if (tiempos[j] != null && tiempos[j].equals(copiatiempo[i])) {
                    System.out.println(series[j]);
                    top++;
                    break; // Solo un resultado por serie
                }
            }
        }

    }
}
