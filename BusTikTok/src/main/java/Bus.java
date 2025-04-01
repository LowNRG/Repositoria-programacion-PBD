import java.util.Random;

public class Bus {
    public static final int TAM = 97;
    public static void main(String[] args) throws InterruptedException {
        // POSICIÓN INICIAL DEL AUTOBÚS
        System.out.println("\n<<<<<<<<<< CARRERA DE BUSES >>>>>>>>>>");
        Thread.sleep(3000);
        int a = 0;
        int b = 0;
        while (a < TAM && b < TAM) {
            Random aleatorio = new Random();
            int turno = aleatorio.nextInt(2) + 1;
            if (turno == 1) {
                a++;
            }else{
                b++;
            }
            limpiarPantalla();

            if(a<TAM && b<TAM){
                System.out.println(dibujarCarrera(a, b));
                Thread.sleep(70);
            }
        }
        if (a>= TAM) {
            System.out.println("\033[32m" + "HA GANADO IES MUTXAMEL!!" + "\033[0m");
        }else{
            System.out.print("\033[32m" + "HA GANADO IES SAN VICENTE!!" + "\033[0m");
        }
    }
    public static String dibujarCarrera(int n1, int n2) {
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("_______________ ").append(" ".repeat(100 - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("| IES MUTXAMEL    |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117));
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n2)).append("_______________ ").append(" ".repeat(100 - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("| IES SANVICENTE  |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append("_".repeat(117));
        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
