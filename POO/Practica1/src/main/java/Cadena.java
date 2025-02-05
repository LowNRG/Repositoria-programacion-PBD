import java.util.ArrayList;

public class Cadena {

    private ArrayList<Programa> listaProgramas;
    private String nombre;

    public Cadena(String nombre){
        this.nombre= nombre;
        this.listaProgramas = new ArrayList<>();
    }
    public void agregarPrograma(Programa programa) {
        if (programa != null && !listaProgramas.contains(programa)) {
            listaProgramas.add(programa);
        } else {
            System.out.println("Programa inválido o ya existente en la cadena.");
        }
    }
    public void eliminarPrograma(Programa programa) {
        if (listaProgramas.remove(programa)) {
            System.out.println(programa.getNombre() + " ha sido eliminado de la cadena " + nombre);
        } else {
            System.out.println("Programa no encontrado en la cadena.");
        }
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }
    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }


    @Override
    public String toString() {
        return "Cadena{" + "nombre='" + nombre + '\'' + ", listaProgramas=" + listaProgramas + '}';
    }


}
