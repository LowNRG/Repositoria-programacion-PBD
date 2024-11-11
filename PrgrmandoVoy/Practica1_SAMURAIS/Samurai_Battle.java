import java.util.Random;
import java.util.Scanner;
public class Samurai_Battle {
    public void Batalla() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int equipos = 2;
        int[] potenciaEquipo1 = new int[7];
        int[] potenciaEquipo2 = new int[7];
        for (int i = 1; i <= equipos; i++) { //para que te pregunte los dos equipos
            System.out.println("Equipo " + i);
            int suma;
            do {
                System.out.println("Introduce la potencia de los 7 samurais: ");
                String potencia = entrada.nextLine();
                String[] subpotencia = potencia.split(" "); //usando el split para separar los numeros del array
                suma = 0;
                try {
                    for (int j = 0; j < 7; j++) {
                        int numero = Integer.parseInt(subpotencia[j]); //aqui pasando los numeros del array de string a int
                        suma += numero;
                        if (i == 1) {
                            potenciaEquipo1[j] = numero;
                        } else {
                            potenciaEquipo2[j] = numero;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Introduce un numero valido.");
                }

                if (suma != 30) {
                    System.out.println("Error, gasta exactamente 30 puntos de potencia entre 7 samurais");
                }

            } while (suma != 30);
            System.out.println("Equipo completado"); //Aqui si la suma de los que has puesto si da 30 entonces te dice completo

        }
        int turnoInicial = random.nextInt(7); //sacando el primer turno random
        System.out.println("¡Empieza la batalla!");
        System.out.println("La batalla inicia con el Samurai " + (turnoInicial + 1));

        int bajas1=0;
        int bajas2=0;

        for (int i = 0; i < 7; i++) { //al principio hice un switch case pero esto es mucho mas sencillo
            int turno = (turnoInicial + i) % 7;  // Cálculo circular para el turno
            System.out.println("Samurai " + (turno + 1) + "---> " + potenciaEquipo1[turno] + " vs "+ potenciaEquipo2[turno]);
            if (potenciaEquipo1[turno] > potenciaEquipo2[turno]) {
                System.out.println("Gana Equipo 1.");
                potenciaEquipo2[turno]=0; //como dice en el ejercicio que cuando pierde pasa a ser 0, aunque no se refleje en la salida
                bajas2++;
            } else if (potenciaEquipo1[turno] < potenciaEquipo2[turno]) {
                System.out.println("Gana Equipo 2.");
                potenciaEquipo1[turno]=0;
                bajas1++;
            } else {
                System.out.println("Empate. Ningún equipo gana este combate.");
                potenciaEquipo1[turno]=0;
                potenciaEquipo2[turno]=0;
                bajas2++;
                bajas1++;
            }
        }
        if (bajas2 >= 4) {
            System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido 4 bajas");
        } else if (bajas1 >= 4) {
            System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido 4 bajas");
        } else {
            System.out.println("¡Es un empate! Ningún equipo gana.");
        }
    }
}




