import java.util.ArrayList;

public class Acompanyante extends MutxamelFC {

    private ArrayList<Jugador> integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad, String parentesco) {
        super(nombre, edad);
        this.integrante = new ArrayList<>();
        this.parentesco = parentesco;
    }
    public void animarEquipo() {
        {
            System.out.println(getNombre() + " animando al Equipo");
        }
    }
}
