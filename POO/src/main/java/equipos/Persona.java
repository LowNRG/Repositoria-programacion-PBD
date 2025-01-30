package equipos;

public class Persona {
    String nombre;
    String apellido;
    String dni;
    int peso;
    int edad;

    public Persona() {

    }

    public Persona(String nombre, String apellido, String dni, int peso, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.peso = peso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public int edad() {
        return this.edad;
    }

    public int peso() {
        return this.peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String concatenar() {
        return this.nombre + " " + this.apellido;
    }

    public void ImorimirInfoPersona() {
        System.out.println(this.nombre + " " + this.apellido + " " + this.dni + " " + this.peso + " " + this.edad);
    }
}



