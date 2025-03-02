import java.util.ArrayList;

public class Entrenador extends MutxamelFC {

    private ArrayList<Equipos> equipos;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, String formacionPreferida) {
        super(nombre, edad);
        this.equipos = new ArrayList<>();
        this.formacionPreferida = formacionPreferida;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }
    public void setFormacionPreferida(String formacionPreferida) throws FormatException{
        if(!formacionPreferida.matches("[0-9]-[0-9]-[0-9]")){
            throw new FormatException();
        }else{
            this.formacionPreferida = formacionPreferida;
        }
    }
    public ArrayList<Equipos> getEquipos() {
        return equipos;
    }
    public void setEquipos(ArrayList<Equipos> equipos) {
        this.equipos = equipos;
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificando entrenamiento...");
    }
    public void hacerCambios() {
        System.out.println("Haciendo cambios...");
    }

}
