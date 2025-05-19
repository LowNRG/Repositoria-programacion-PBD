import java.io.*;
import java.util.ArrayList;

public class SerializarCoche{
    public static void main(String[] args) {

        ArrayList<Coche> coche = new ArrayList<>();
        coche.add(new Coche("Toyota", 2500, "3456TYN"));
        coche.add(new Coche("BMW", 0, "31126IJN"));
        coche.add(new Coche("Seat", 100000, "7897HAL"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("clase_coche.ser"))) {
            oos.writeObject(coche);
            System.out.println("Lista serializada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}