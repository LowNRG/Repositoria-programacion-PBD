import java.io.*;
import java.util.ArrayList;

public class SerializacionConErrores {
    public static void main(String[] args) {
        ArrayList<Coche> cochesDeserializados = null;
        String archivo = "clase_prueba.ser";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            cochesDeserializados = (ArrayList<Coche>) ois.readObject();
            System.out.println("Lista deserializada correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. Se creará con datos por defecto.");
            cochesDeserializados = crearDatosPorDefecto(archivo);
        } catch (IOException e) {
            System.out.println("Error de entrada/salida al deserializar. El archivo puede estar dañado.");
            cochesDeserializados = crearDatosPorDefecto(archivo);
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada durante la deserialización.");
            e.printStackTrace();
        }

        if (cochesDeserializados != null) {
            for (Coche c : cochesDeserializados) {
                System.out.println(c);
                if (c.getMatricula() == null) {
                    System.out.println("El atributo 'Matricula' es null tras la deserialización (como era de esperar).");
                }
            }
        }
    }

    private static ArrayList<Coche> crearDatosPorDefecto(String archivo) {
        ArrayList<Coche> lista = new ArrayList<>();
        lista.add(new Coche("Toyota", 2500, "3456TYN"));
        lista.add(new Coche("BMW", 0, "31126IJN"));
        lista.add(new Coche("Seat", 100000, "7897HAL"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lista);
            System.out.println("Archivo creado con datos por defecto.");
        } catch (IOException ex) {
            System.out.println("No se pudo crear el archivo con datos por defecto.");
            ex.printStackTrace();
        }
        return lista;
    }
}