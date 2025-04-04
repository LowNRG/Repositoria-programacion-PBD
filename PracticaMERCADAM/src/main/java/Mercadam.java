import java.util.*;

public class Mercadam {

    public static List<Cliente> clientes;

    public Mercadam() {
        clientes = new ArrayList<>();
    }
    static void generarClientes() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        clientes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            StringBuilder usuario = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                int index = (int) (caracteres.length() * Math.random());
                usuario.append(caracteres.charAt(index));
            }
            StringBuilder contrasena = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                int index = (int) (caracteres.length() * Math.random());
                contrasena.append(caracteres.charAt(index));
            }
            Cliente cliente = new Cliente(usuario.toString(), contrasena.toString());
            clientes.add(cliente);
        }

    }

    public static List<Cliente> getClientes(){
        return Collections.unmodifiableList(clientes);
    }
}
