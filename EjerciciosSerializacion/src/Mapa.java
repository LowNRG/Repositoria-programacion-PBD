import java.io.*;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        // a) Crear el HashMap con varios objetos Persona
        HashMap<String, Coche> mapa = new HashMap<>();
        mapa.put("Toyota", new Coche("Toyota", 2500, "3456TYN"));
        mapa.put("BMW", new Coche("BMW", 0, "31126IJN"));
        mapa.put("Seat", new Coche("Seat", 100000, "7897HAL"));

        // b) Serializar el HashMap en mapa.ser
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mapa.ser"))) {
            oos.writeObject(mapa);
            System.out.println("Mapa serializado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al serializar el mapa.");
            e.printStackTrace();
        }

        // c) Deserializar y mostrar ordenado por claves
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mapa.ser"))) {
            HashMap<String, Coche> mapaRecuperado = (HashMap<String, Coche>) ois.readObject();
            TreeMap<String, Coche> mapaOrdenado = new TreeMap<>(mapaRecuperado);
            System.out.println("Contenido del mapa ordenado por claves:");
            for (Map.Entry<String, Coche> entry : mapaOrdenado.entrySet()) {
                System.out.println("Clave: " + entry.getKey() + " -> Valor: " + entry.getValue());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar el mapa.");
            e.printStackTrace();
        }
    }
}