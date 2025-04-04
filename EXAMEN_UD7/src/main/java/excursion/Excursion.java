package excursion;

import java.util.*;

public class Excursion {

    private String nombre_actividad;
    private String localidad;
    private double precio;
    private Set<String> profesores;
    private Set<Estudiante> listaAsistentes;

    public Excursion(String nombre_actividad, String localidad, double precio){
        this.nombre_actividad = nombre_actividad;
        this.localidad = localidad;
        this.precio = precio;
        listaAsistentes = new HashSet<>();
    }

    void insertarProfesor(String profesor){
        profesores.add(profesor);
    }
    void inscribirAsistente(Estudiante estudiante){
        listaAsistentes.add(estudiante);
    }
    private double calcularImporteIngreso(){
         double importeTotal;
        return importeTotal = precio * listaAsistentes.size();
    }
    void verAsistentes(){
        System.out.println("Lista ordenada: " + listaAsistentes.);
    }
    void eliminarAsistentesPorEdad(int edad){
        Iterator<Estudiante> it = listaAsistentes.iterator();
        while (it.hasNext()){
            Estudiante estudiante = it.next();
            if(estudiante.edad< edad){
                it.remove();
            }
        }


    }
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre_actividad() {
        return nombre_actividad;
    }

    public void setNombre_actividad(String nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
