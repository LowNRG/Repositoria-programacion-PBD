import java.util.HashMap;
import java.util.Map;

public class Pedido {

    public HashMap<Producto, Integer> pedido;
    private double importe_total;

    public Pedido(){
        this.pedido = new HashMap<Producto, Integer>();
        this.importe_total = 0;
    }
    public void put(Producto producto, int cantidad) {
        if (pedido.containsKey(producto)) {
            pedido.put(producto, pedido.get(producto) + cantidad);
        } else {
            pedido.put(producto, cantidad);
        }
        importe_total += producto.getPrecio() * cantidad;
    }

    public Map<Object, Object> getPedido() {
        return null;
    }
    public double getImporte_total() {
        return importe_total;
    }

    public int getOrDefault(Producto p, int i) {
        if (pedido.containsKey(p)) {
            return pedido.get(p);
        } else {
            return i;
        }
    }

    public Iterable<? extends Map.Entry<Producto, Integer>> entrySet() {
        return pedido.entrySet();
    }
}
