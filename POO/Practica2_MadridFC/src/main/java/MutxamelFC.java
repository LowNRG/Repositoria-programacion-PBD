import java.util.ArrayList;

public abstract class MutxamelFC {
    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return this.nombre;
    }
}
