public class TarjetaCredito extends MetodoPago {

    private String nroTarjeta;
    private String tipo;

    public TarjetaCredito(String nroTarjeta, String tipo){
        this.nroTarjeta = nroTarjeta;
        this.tipo = tipo;
    }
    public boolean validarTarjeta(String nroTarjeta, String tipo){
        System.out.println("Validando tarjeta un segundo...");

        if (tipo.equalsIgnoreCase("VISA") ||
                tipo.equalsIgnoreCase("MASTERCARD") ||
                tipo.equalsIgnoreCase("MAESTRO") && nroTarjeta.length() == 16 ) {
            System.out.println("Datos introducidos correctos. Tarjeta valida.");
            return true;
        }else{
            System.out.println("Los datos introducidos no son correctos.");
        }

        return false;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNroTarjeta() {
        return nroTarjeta;
    }
    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipo);
    }
}
