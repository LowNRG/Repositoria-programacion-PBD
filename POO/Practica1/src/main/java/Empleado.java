public class Empleado {

    private static int contador=1;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo, Empleado director){
        this.nombre = nombre;
        this.id = generarID();
        this.cargo = validarCargo(cargo);
        this.director = cargo.equals("director") ? null :director;
    }

    public String generarID(){
        return String.format("EP%03d", contador++);
    }
    public String validarCargo(String cargo){
        String[] cargosValidos = {"director", "técnico", "presentador", "colaborador"};
        for(String i : cargosValidos){
            if(i.equals(cargo)){
                return cargo;
            }
        }
        return "pte";
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Empleado getDirector() {
        return director;
    }
    public void setDirector(Empleado director) {
        this.director = director;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id='" + id + '\'' + ", nombre='" + nombre + '\'' + ", cargo='" + cargo + '\'' + ", director=" + director + '}';
    }
}
