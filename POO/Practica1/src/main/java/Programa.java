import java.util.ArrayList;
import java.time.LocalDate;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

public Programa(String nombre, Cadena cadena, String nombreDirector){
    this.nombre = nombre;
    this.cadena = cadena;
    this.temporadas = 0;
    this.listaEmpleados = new ArrayList<>();
    this.listaInvitados = new ArrayList<>();
    this.director = new Empleado(nombreDirector, "director", null);
    this.listaEmpleados.add(director);
}

    public void invitadosTemporada(int temporada) {
        System.out.println("Invitados en la temporada " + temporada + ":");
        for (Invitado i : listaInvitados) {
            if (i.getTemporada() == temporada) {
                System.out.println("- " + i.getNombre() + " (" + i.getProfesion() + ")");
            }
        }
    }
    public int vecesInvitado(String nombre) {
        int contador = 0;
        for (Invitado i : listaInvitados) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                contador++;
            }
        }
        return contador;
    }
    public void rastrearInvitado(String nombre) {
        System.out.println("Historial de " + nombre + " en el programa " + this.nombre + ":");
        for (Invitado i : listaInvitados) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("- Temporada: " + i.getTemporada() + ", Fecha: " + i.getFecha_visita());
            }
        }
    }
    public boolean buscarInvitado(String nombre) {
        for (Invitado i : listaInvitados) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }


    public void invitadoAntes(String nombre, Programa otroPrograma) {
        LocalDate fechaEstePrograma = null, fechaOtroPrograma = null;
        for (Invitado i : listaInvitados) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                fechaEstePrograma = i.getFecha_visita();
                break;
            }
        }
        for (Invitado i : otroPrograma.getListaInvitados()) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                fechaOtroPrograma = i.getFecha_visita();
                break;
            }
        }
        if (fechaEstePrograma != null && fechaOtroPrograma != null) {
            if (fechaEstePrograma.isBefore(fechaOtroPrograma)) {
                System.out.println(nombre + " estuvo primero en " + this.nombre);
            } else if (fechaOtroPrograma.isBefore(fechaEstePrograma)) {
                System.out.println(nombre + " estuvo primero en " + otroPrograma.getNombre());
            } else {
                System.out.println(nombre + " asistió a ambos programas el mismo día.");
            }
        } else {
            System.out.println("Error no se puede comparar.");
        }
    }


    public void insertarInvitado(String nombre, String profesion, int temporada) {
        Invitado nuevoInvitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(nuevoInvitado);
    }

    public void eliminarInvitado(Invitado invitado) {
        if (listaInvitados.remove(invitado)) {
            System.out.println(invitado.getNombre() + " ha sido eliminado de la lista de invitados.");
        } else {
            System.out.println("El invitado no se encuentra en la lista.");
        }
    }

    public void insertarEmpleado(String nombre, String cargo, Empleado director) {
        if (cargo.equalsIgnoreCase("director")) {
            System.out.println("No se puede agregar otro director al programa.");
            return;
        }

        Empleado nuevoEmpleado = new Empleado(nombre, cargo, this.director);
        listaEmpleados.add(nuevoEmpleado);
        System.out.println(nombre + " ha sido agregado como " + cargo);
    }
    public void eliminarEmpleado(Empleado empleado) {
        if (listaEmpleados.remove(empleado)) {
            System.out.println(empleado.getNombre() + " ha sido eliminado del programa " + nombre);
        } else {
            System.out.println("Empleado no encontrado en el programa.");
        }
    }

    public Cadena getCadena() {
        return cadena;
    }
    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }
    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }
    public Empleado getDirector() {
        return director;
    }
    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Programa{" + "nombre='" + nombre + '\'' + ", cadena=" + cadena + ", temporadas=" + temporadas + ", listaEmpleados=" + listaEmpleados + ", listaInvitados=" + listaInvitados + ", director=" + director + '}';
    }
}
