package dispositivos_inteligentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto {

    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado");
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
