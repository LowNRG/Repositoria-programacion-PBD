

public class Estudiante {

    public static int contadorEstudiantes = 0;
    public static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;

    public Estudiante(String nombre){
        this.nombre = nombre;
        contadorEstudiantes++;
        nia = contadorEstudiantes;

    }
    public Estudiante(String nombre, String curso, String email){

        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        contadorEstudiantes++;
        nia = contadorEstudiantes;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCurso(){
        return curso;
    }
    public int getNia(){
        return nia;
    }
    public String getEmail(){
        return email;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString(){
        return "Alumno: (nombre = " + this.nombre + " curso: " + this.curso+ " nia: " + this.nia + " email: " + this.email + ")";
    }
    public static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;
    }
    public static boolean validarCorreo(String email){

        return email.matches(FORMATO_CORREO) && email != null;
    }

}
