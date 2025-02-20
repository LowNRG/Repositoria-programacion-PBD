package dispositivos_inteligentes;

public abstract class Dispositivo {
    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.estado = false;
    }
    public abstract void encender();
    public void apagar(){
        if(estado){
            System.out.println("Apagando " + nombre);
            estado = false;
        } else {
            System.out.println(nombre + " ya está apagado");
        }
    }
    public void mostrarEstado(){
        if(estado){
            System.out.println(nombre + " está encendido");
        } else {
            System.out.println(nombre + " está apagado");
        }
    }

    public String getNombre(){
        return nombre;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
