import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

class ProgramaTest {

    @Test
    void testCrearPrograma() {
        Cadena antena3 = new Cadena("Antena 3");
        Programa elHormiguero = new Programa("El Hormiguero", antena3, "Director1");

        assertEquals("El Hormiguero", elHormiguero.getNombre());
        assertEquals("Antena 3", elHormiguero.getCadena().getNombre());
        assertNotNull(elHormiguero.getListaEmpleados());
        assertNotNull(elHormiguero.getListaInvitados());
    }

    @Test
    void testInsertarEmpleado() {
        Programa elHormiguero = new Programa("El Hormiguero", new Cadena("Antena 3"), "Director1");
        elHormiguero.insertarEmpleado("Pablo Motos", "presentador", null);

        assertEquals(2, elHormiguero.getListaEmpleados().size()); // Director + Presentador
        assertEquals("Pablo Motos", elHormiguero.getListaEmpleados().get(1).getNombre());
    }

    @Test
    void testInsertarInvitado() {
        Programa elHormiguero = new Programa("El Hormiguero", new Cadena("Antena 3"), "Director1");

        LocalDate fechaPrueba = LocalDate.of(2025, 5, 10);
        Invitado invitado = new Invitado("Aitana", "Cantante", 1);
        elHormiguero.getListaInvitados().add(invitado);

        assertEquals(1, elHormiguero.getListaInvitados().size());
        assertEquals("Aitana", elHormiguero.getListaInvitados().get(0).getNombre());
    }

    @Test
    void testVecesInvitado() {
        Programa elHormiguero = new Programa("El Hormiguero", new Cadena("Antena 3"), "Director1");

        elHormiguero.getListaInvitados().add(new Invitado("Aitana", "Cantante", 1));
        elHormiguero.getListaInvitados().add(new Invitado("Aitana", "Cantante", 2));

        assertEquals(2, elHormiguero.vecesInvitado("Aitana"));
    }

    @Test
    void testInvitadoAntes() {
        Programa elHormiguero = new Programa("El Hormiguero", new Cadena("Antena 3"), "Director1");
        Programa laRebelion = new Programa("La Rebelión", new Cadena("Telecinco"), "Director2");

        Invitado aitana1 = new Invitado("Aitana", "Cantante",  1);
        Invitado aitana2 = new Invitado("Aitana", "Cantante", 2);

        elHormiguero.getListaInvitados().add(aitana1);
        laRebelion.getListaInvitados().add(aitana2);

        // Simulamos la comparación manualmente
        int comparacion = aitana1.getFecha_visita().compareTo(aitana2.getFecha_visita());
        assertTrue(comparacion < 0); // 2023 es antes que 2024
    }
}
