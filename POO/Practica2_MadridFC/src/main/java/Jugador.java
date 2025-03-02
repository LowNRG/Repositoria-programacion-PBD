import java.util.ArrayList;

public class Jugador extends MutxamelFC{

    private ArrayList<Equipos> categoria;
    private int dorsal;
    private ArrayList<Posiciones> posicion;

    public Jugador(String nombre, int edad, int dorsal) {
        super(nombre, edad);
        this.categoria = new ArrayList<>();
        this.dorsal = dorsal;
        this.posicion = new ArrayList<>();
    }

    public ArrayList<Equipos> getCategoria() {
        return categoria;
    }
    public void setCategoria(ArrayList<Equipos> categoria) {
        this.categoria = categoria;
    }
    public ArrayList<Posiciones> getPosicion() {
        return posicion;
    }
    public void setPosicion(ArrayList<Posiciones> posicion) {
        this.posicion = posicion;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) throws DorsalRepetidoException {
        if(comprobarDorsal(dorsal)){
            this.dorsal = dorsal;
        }else{
            throw new DorsalRepetidoException();
        }
    }

    public boolean comprobarDorsal(int dorsal){
        return this.dorsal != dorsal;
    }
    public void calentar() {
        System.out.println("Calentando los musculos...");
    }
    public void descansar() {
        System.out.println("Descansando las piernas...");
    }
    public void marcarGol() {
        System.out.println("Tirando a puerta y...");
    }


}
