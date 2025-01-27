

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe", "Sanchez", "12345678A", 80, 30);
        Persona persona2 = new Persona();
        System.out.println(persona1.nombre + " " + persona1.apellido + " " + persona1.dni + " " + persona1.peso + " " + persona1.edad);
        System.out.println(persona2.nombre + " " + persona2.apellido + " " + persona2.dni + " " + persona2.peso + " " + persona2.edad);
        System.out.println(persona1.concatenar());

        System.out.println("Antes:" + persona1.getNombre());
        persona1.setNombre("Pepa");
        System.out.println("Despues:" + persona1.getNombre());

    }
}
