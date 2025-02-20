package dispositivos_inteligentes;

public class Televisor extends Dispositivo implements ControlRemoto {

    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor");
    }

    @Override
    public void encender() {
        if (!getEstado()) {
            System.out.println("Encendiendo " + getNombre());
            setEstado(true);
        } else {
            System.out.println(getNombre() + " ya está encendido");
        }
    }
}
