public class AppPrograma {

public static void main (String[] args){ //creamos una cadena de tv
    Cadena antena3 = new Cadena("Antena 3");
    System.out.println(antena3);
    //creamos un programa
    Programa el_hormiguero = new Programa("El Hormiguero",antena3,"Director1");
    System.out.println(el_hormiguero); System.out.println(antena3);
    //insertamos empleados en el programa
    el_hormiguero.insertarEmpleado("Pablo Motos","presentador",null);
    System.out.println(el_hormiguero);
    //ver empleados del programa
    System.out.println(el_hormiguero.getListaEmpleados());
    //insertamos invitados en el programa
    el_hormiguero.insertarInvitado("Aitana","cantante",1);
    //ver invitados del programa
    System.out.println(el_hormiguero.getListaInvitados());

    Programa elHormiguero = new Programa("El Hormiguero", antena3, "Director1");

    // Insertar empleados
    elHormiguero.insertarEmpleado("Pablo Motos", "presentador", null);

    // Insertar invitados con fechas manuales
    elHormiguero.insertarInvitado("Aitana", "Cantante", 1);
    elHormiguero.insertarInvitado("Aitana", "Cantante", 2);

    // Mostrar invitados
    System.out.println("Invitados: " + elHormiguero.getListaInvitados());

    // Probar métodos de consulta
    System.out.println("Veces que Aitana ha sido invitada: " + elHormiguero.vecesInvitado("Aitana"));
    elHormiguero.rastrearInvitado("Aitana");

    // Comparar en qué programa estuvo primero
    Cadena telecinco = new Cadena("Telecinco");
    Programa laRebelion = new Programa("La Rebelión", telecinco, "Director2");
    laRebelion.insertarInvitado("Aitana", "Cantante", 3);
    elHormiguero.invitadoAntes("Aitana", laRebelion);

}
}
