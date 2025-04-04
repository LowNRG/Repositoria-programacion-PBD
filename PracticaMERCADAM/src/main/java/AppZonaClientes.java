import java.util.*;

public class AppZonaClientes {
    static Scanner entrada = new Scanner(System.in);
    public static Cliente cliente;

    public static void main(String[] args) {
        Mercadam mercadam = new Mercadam();
        Mercadam.generarClientes();
        System.out.println(Mercadam.clientes);
        AppZonaClientes appZonaClientes = new AppZonaClientes();
        appZonaClientes.autenticacion(Mercadam.getClientes());
        appZonaClientes.iniciarCompra();

    }
    public void autenticacion(List<Cliente> clientes){
        int intentos = 0;
        while (intentos < 3 ) {
            System.out.println("*** COMPRA ONLINE DE MERCADAM ***");
            System.out.println("Usuario: ");
            String usuario = entrada.nextLine();
            System.out.println("Contraseña: ");
            String contrasena = entrada.nextLine();
            for (Cliente cliente : clientes) {
                if (cliente.getUsuario().equals(usuario) && cliente.getContrasena().equals(contrasena)) {
                    AppZonaClientes.cliente = cliente;
                    iniciarCompra();
                    break;
                }
            }
            intentos++;
            System.out.println("algo no coincide o no existe vuelve a intentarlo");
        }
        if (intentos == 3) {
            System.out.println("ERROR DE AUTENTICACION");
            AppZonaClientes.cliente = new Cliente("anonimo", "anonimo");
            iniciarCompra();
        }
    }
    public void iniciarCompra(){
        cliente.crearPedido();
        imprimirProductos();
    }
    static void imprimirProductos(){
        System.out.println("Bienvenid@ " + cliente.getUsuario());
        System.out.println("Añade productos a tu lista de la compra...");
        for(Producto producto : Producto.values()){
            System.out.println(producto.toString());
        }
        System.out.println("===========================================================================");
        System.out.println("Escribe el nombre del producto que quieres añadir a tu lista de la compra: ");
        System.out.println("===========================================================================");
        String producto = entrada.nextLine();
        cliente.insertarProducto(producto);
    }
    private void imprimirDespedida(){

    }
}
