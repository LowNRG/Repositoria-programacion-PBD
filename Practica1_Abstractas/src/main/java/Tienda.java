import java.util.Scanner;

public class Tienda {

static void realizarPago(MetodoPago metodo, double importe){
    metodo.procesarPago(importe);
}
    static void iniciarPago() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que metodo de pago quieres usar? [1.Bizum, 2.Tarjeta, 3.PayPal]");
        int opcion = scanner.nextInt();

        MetodoPago metodoPago = null;
        double importe = 0;

        switch (opcion) {
            case 1:
                scanner.nextLine();//Limpiar buffer
                System.out.println("Introduce el teléfono (9 dígitos): ");
                String telefono = scanner.nextLine();
                System.out.println("Introduce el pin (6 dígitos): ");
                int pin = scanner.nextInt();
                Bizum Bizum = new Bizum(telefono, pin );
                if (Bizum.validarBizum(telefono, pin)) {
                    System.out.print("Introduce el importe: ");
                    importe = scanner.nextDouble();
                    realizarPago(Bizum, importe);
                } else {
                    System.out.println("Datos de Bizum incorrectos.");
                }
                break;
            case 2:
                scanner.nextLine();//Limpiar buffer
                System.out.println("Introduce los datos de la tarjeta.");
                System.out.println("Número (16 digitos): ");
                String numeroTarjeta = scanner.nextLine();
                System.out.println("Introduce el tipo de tarjeta: [VISA] - [MASTERCARD] -  [MAESTRO] ");
                String tipo = scanner.nextLine();
                TarjetaCredito tarjeta = new TarjetaCredito(numeroTarjeta, tipo);
                if (tarjeta.validarTarjeta(numeroTarjeta, tipo)) {
                    System.out.print("Introduce el importe: ");
                    importe = scanner.nextDouble();
                    realizarPago(tarjeta, importe);
                } else {
                    System.out.println("Datos de la tarjeta incorrectos.");
                }
                break;
            case 3:
                scanner.nextLine();//Limpiar buffer
                System.out.print("Introduce tu cuenta: ");
                String email = scanner.nextLine();
                System.out.print("Introduce tu saldo: ");
                double saldo = Double.parseDouble(scanner.nextLine());
                PayPal paypal = new PayPal(email, saldo);
                if (paypal.validarPaypal(email, saldo, importe)) {
                    System.out.print("Introduce el importe: ");
                    importe = scanner.nextDouble();
                    realizarPago(paypal, importe);
                } else {
                    System.out.println("Datos de PayPal incorrectos.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
 }
}
