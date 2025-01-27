import java.util.Scanner;

public class Main (){
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un nombre: ");
        String nombre = teclado.next();
        System.out.println("Introduce la edad: ");
        int edad = teclado.nextInt();
        System.out.println("Introduce tu geneero: ");
        char genero = teclado.next().charAt(0);
        System.out.println("Introduce tu peso: ");
        float peso = teclado.nextFloat();
        System.out.println("Introduce tu altura: ");
        float altura = teclado.nextFloat();

        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente(nombre, edad, genero);
        Paciente paciente3 = new Paciente(nombre, edad, genero, peso, altura);

        paciente1.setNombre("Paco");
        paciente1.setaltura(1.95F);
        paciente1.setPeso(87);
        paciente1.setGenero('H');
        paciente1.setEdad(35);

        comprobarPeso(paciente1);
        comprobarPeso(paciente2);
        comprobarPeso(paciente3);
    }
    public void comprobarPeso(Paciente paciente){

        int imc = paciente.calcularIMC();


        switch(imc){
            case Paciente.PESO_BAJO:
                System.out.println("LA persona " + paciente.getNombre()+ " por debajo de su peso ideal");
                break;
            case Paciente.PESO_IDEAL:
                System.out.println("LA persona" + paciente.getNombre()+ " esta en su peso ideal");
                break;
            case Paciente.SOBREPESO:
                    System.out.println("LA persona " + paciente.getNombre()+ " esta por encima de su peso ideal");
                    break;
        }
    }
    public static void mayorEdad(Paciente paciente){

        if(paciente.esMayordeEdad()){
            System.out.println("La persona " + paciente.getNombre()+ " es mayor de edad");

        }else{
            System.out.println("La persona " + paciente.getNombre()+ " no es mayor de edad");
        }
    }

}
