import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cliente {

    private String usuario;
    private String contrasena;
    private Pedido pedido;
    private boolean promociones;
    private final String direccion;

    public Cliente(String usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.pedido = null;
        this.promociones = false;
        this.direccion = "Calle falsa, 123";
    }
    void crearPedido(){
           pedido = new Pedido();


    }
    void insertarProducto(String NombreProducto){
        boolean encontrado = false;
        for (Producto p : Producto.values()) {
            if (p.getNombre().equalsIgnoreCase(NombreProducto)) {
                pedido.put(p, pedido.getOrDefault(p, 0) + 1);
                encontrado = true;
                System.out.println("Has añadido" + p.getNombre() +" con un precio de " + p.getPrecio());
                System.out.print("El total de tu pedido es: " + importePedido());
                System.out.println("¿Quieres añadir otro producto? (si/no)");
                String respuesta = AppZonaClientes.entrada.nextLine();
                if (respuesta.equalsIgnoreCase("si")) {
                    AppZonaClientes.imprimirProductos();
                } else {
                    System.out.println("Gracias por tu compra " + usuario);
                    System.out.print("El resumen de tu pedido es" + pedido);
                    System.out.println("El total de tu pedido es: " + importePedido());
                                   }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El producto no existe elige otro!");
            AppZonaClientes.imprimirProductos();
        }
    }
    private double importePedido(){
        for (Map.Entry<Producto, Integer> entry : pedido.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            double precio = producto.getPrecio();
            double total = precio * cantidad;
            pedido.put(producto, (int) total);
        }
        return pedido.getImporte_total();
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}
