package dispositivos_inteligentes;

public class ParlanteInteligente extends Dispositivo  {

    public ParlanteInteligente(String nombre) {
        super(nombre);
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
