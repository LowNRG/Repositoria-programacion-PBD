import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada){
        this.nombre = nombre;
        this.profesion = profesion;
        this.fecha_visita = pedirFecha();
        this.temporada = temporada;
    }
    private LocalDate pedirFecha() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el año de visita:");
        int anyo = scanner.nextInt();
        System.out.println("Introduce el mes de visita:");
        int mes = scanner.nextInt();
        System.out.println("Introduce el día de visita:");
        int dia = scanner.nextInt();

        return LocalDate.of(anyo, mes, dia);
    }


    public int getTemporada() {
        return temporada;
    }
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    public LocalDate getFecha_visita() {
        return fecha_visita;
    }
    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Invitado{" + "nombre='" + nombre + '\'' + ", profesion='" + profesion + '\'' + ", fecha_visita=" + fecha_visita + ", temporada=" + temporada + '}';
    }
}
