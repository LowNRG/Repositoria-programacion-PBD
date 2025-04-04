public enum Producto {
    MANZANAS("MANZANAS ", 2.30),
    PAN("PAN", 1.00),
    ARROZ("ARROZ", 3.50),
    POLLO("POLLO", 4.30),
    LECHE("LECHE", 1.30),
    ACEITE("ACEITE", 8.30),
    HUEVOS("HUEVOS", 3.30),
    TOMATES("TOMATES", 4.00),
    PASTA("PASTA", 0.89);

    private String nombre;
    private double Precio;

    Producto(String nombre, double Precio) {
        this.nombre = nombre;
        this.Precio = Precio;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return Precio;
    }

    public String toString() {
        return this.name() + "precio " + this.Precio;
    }

}
