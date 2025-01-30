import java.util.ArrayList;
import java.util.Arrays;

public class cosas_arraylist {

    public static void main (String[] args){

        ArrayList<Integer> listanumeros = new ArrayList<>();
        listanumeros.add(3);
        listanumeros.add(14);
        listanumeros.add(45);
        listanumeros.add(1, 9);
        System.out.println(listanumeros.get(0));
        listanumeros.remove(0);
        System.out.println(listanumeros.get(0));
        listanumeros.remove(Integer.parseInt("45"));
        System.out.println(listanumeros);
        System.out.println("Posicion del numero 14: "+ listanumeros.indexOf(14));
        System.out.println("Posicion del numero 45: "+ listanumeros.indexOf(45));

        for(int i =0; i< listanumeros.size(); i++){
            System.out.println(listanumeros.get(i));
        }
        for(int lista : listanumeros){
            System.out.println(lista);
        }
        listanumeros.set(0,56);
        System.out.println(listanumeros.get(0));
        String lista_copia = listanumeros.clone();
        System.out.println(lista_copia);

        listanumeros.clear();
        System.out.println(listanumeros);

        if(listanumeros.contains(56)){
            System.out.println("Esta en la lista");
        }
        if (listanumeros.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista no esta vacia");
        }

        listanumeros.addAll(Arrays.asList(2,5,9,12,33));

        System.out.println(listanumeros);


    }
public static void insertarVarios(ArrayList<Integer> lista, Integer...numeros){
        lista.addAll();
}
}
