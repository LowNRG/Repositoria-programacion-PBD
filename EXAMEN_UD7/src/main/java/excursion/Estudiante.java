package excursion;

import java.util.Objects;

public class Estudiante {
    private String apellidos;
    private String nombre;
    private String curso;
    int edad;

    public Estudiante(String apellidos, String nombre, String curso, int edad){
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.curso = curso;
        this.edad = edad;
    }

}
