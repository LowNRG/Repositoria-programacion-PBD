import java.io.*;
import java.util.ArrayList;

public class JerarquiaSerializacion {
    public static void main(String[] args) {
        // b) Serializa una lista que contenga empleados y jefes
        ArrayList<Empleado> lista = new ArrayList<>();
        lista.add(new Empleado("Ana", 2000.0));
        lista.add(new Empleado("Carlos", 1800.0));
        lista.add(new Jefe("Marta", 3000.0, "Ventas"));
        lista.add(new Jefe("Luis", 3500.0, "Tecnología"));

        // Serializar la lista
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empleados.ser"))) {
            oos.writeObject(lista);
            System.out.println("Lista serializada correctamente.");
        } catch (IOException e) {
            System.out.println("Error al serializar la lista.");
            e.printStackTrace();
        }

        // c) Recupera la lista e imprime su contenido
        ArrayList<Empleado> listaRecuperada = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empleados.ser"))) {
            listaRecuperada = (ArrayList<Empleado>) ois.readObject();
            System.out.println("\nContenido de la lista deserializada:");
            for (Empleado emp : listaRecuperada) {
                System.out.println(emp);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar la lista.");
            e.printStackTrace();
        }
    }
}