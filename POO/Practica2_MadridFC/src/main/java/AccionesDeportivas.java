public interface AccionesDeportivas {

    static void entrenar(){
        System.out.println(Entrenador.getNombre() + " entrenando...");
    }
    static void jugarPartido(String rival){
        System.out.println("Jugando contra " + rival);
    }

}
