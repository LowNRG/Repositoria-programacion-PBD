public class Bizum extends MetodoPago{

    private String telefono;
    private int pin;

    public Bizum (String telefono, int pin){
        this.pin = pin;
        this.telefono = telefono;
    }
    public boolean validarBizum(String telefono, int pin){
        System.out.println("Validando Bizum un segundo...");

        int PinCorrecto = getPin();
        System.out.println("El pin correcto es: " + PinCorrecto);

        if(telefono.length() == 9 && pin == PinCorrecto){
            System.out.println("Telefono y pin correctos");
            return true;
        } else {
            System.out.println("Datos de Bizum incorrectos.");
            return false;
        }
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Bizum.");
    }
}
