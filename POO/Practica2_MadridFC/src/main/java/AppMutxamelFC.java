import java.util.ArrayList;

public class AppMutxamelFC {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Maradona", 25, 10);
        Jugador jugador2 = new Jugador("Kiko Riquelme", 28, 11);
        Jugador jugador3 = new Jugador("Bugs Bunny", 30, 12);
        Jugador jugador4 = new Jugador("Pato Lucas", 27, 13);

        ArrayList<Equipos> SENIOR = new ArrayList<>();
        SENIOR.add(Equipos.SENIOR);

        jugador1.setCategoria(SENIOR);
        jugador2.setCategoria(SENIOR);
        jugador3.setCategoria(SENIOR);
        jugador4.setCategoria(SENIOR);

        Entrenador entrenador = new Entrenador("Pep Guardiola", 50, "4-3-3");
        entrenador.setEquipos(SENIOR);

        Masajista masajista = new Masajista("Juanito", 40, "Fisioterapeuta", 12);
        Masajista masajista2 = new Masajista("Pepito", 45, "Quiromasajista", 15);


        Acompanyante acompanante = new Acompanyante("Pepita", 30, "Esposa");
        Acompanyante acompanante2 = new Acompanyante("Juanita", 35, "Hermana");

        FuncionesIntegrantes.concentrarse();
        AccionesDeportivas.entrenar();
        masajista.darMasaje(jugador1);
        FuncionesIntegrantes.viajar("Madrid");
        entrenador.planificarEntrenamiento();
        AccionesDeportivas.entrenar();
        jugador1.descansar();
        jugador1.calentar();
        AccionesDeportivas.jugarPartido("Barça");
        acompanante.animarEquipo();
        acompanante2.animarEquipo();
        entrenador.hacerCambios();
        jugador1.marcarGol();
        FuncionesIntegrantes.celebrarGol();

        masajista.darMasaje(jugador1);
        masajista2.darMasaje(jugador2);
        masajista2.darMasaje(jugador3);
        masajista.darMasaje(jugador4);

        FuncionesIntegrantes.viajar("Mutxamel");
        jugador1.descansar();
    }
}
