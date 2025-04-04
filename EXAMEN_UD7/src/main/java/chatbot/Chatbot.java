package chatbot;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Chatbot {
    static Scanner entrada = new Scanner(System.in);
    static HashMap<String, String> palabras = new HashMap<>();
    public static void main(String[] args) {

        palabras.put("Hola", "Hola! que tal estas?");
        palabras.put("Bien y tu", "yo tambien estoy bien! pongamonos a trabajar");
        palabras.put("¿cómo estás?","Genial! pongamonos a currar!");
        palabras.put("adios", "¡Hasta luego!");
        palabras.put("gracias", "De nada, que tengas un buen dia!");
        palabras.put("salir", "¡Adios!");
        Chatbot chatbot = new Chatbot();
        chatbot.output("bienvenido! Escribe <salir> cuando quieras acabar la conversación...");
        chatbot.input();



    }
    public void comprobator(String input){
        if(!Objects.equals(input, "salir")) {
            output(palabras.getOrDefault(input, "No te entiendo :("));
        }else{
            System.out.println(palabras.get("salir"));
            System.exit(0);
        }
    }
    public void input(){
        System.out.print("Tu: ");
        String fraseUser = entrada.nextLine();
        comprobator(fraseUser);
    }
    public void output(String frase){
        System.out.println("Chatbot: " + frase);
        input();
    }

}
