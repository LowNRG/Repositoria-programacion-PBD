import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializarCoche {

    public static void main(String[] args) {
        ArrayList<Coche> cochesDeserializados = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("clase_coche.ser"))) {
            cochesDeserializados = (ArrayList<Coche>) ois.readObject();
            System.out.println("Lista deserializada correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (cochesDeserializados != null) {
            for (Coche c : cochesDeserializados) {
                System.out.println(c);
                if (c.getMatricula() == null){
                    System.out.println("La Matricula es null despues de la serializacion");
                }
            }
        }
    }
}
