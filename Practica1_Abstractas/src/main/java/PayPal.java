public class PayPal extends MetodoPago{

    private String cuenta;
    private double saldo;

    public PayPal (String cuenta, double saldo){
        this.cuenta = cuenta;
        this.saldo = saldo;
    }
    public String getCuenta() {
        return cuenta;
    }
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean validarPaypal(String cuenta, double saldo, double importe){
        System.out.println("Validando PayPal un segundo...");

        if(cuenta.matches("^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,}$") && saldo >= importe){
            System.out.println("E-mail y saldo correctos");
            return true;
        }
        return false;
    }
    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Paypal." );
    }
}
