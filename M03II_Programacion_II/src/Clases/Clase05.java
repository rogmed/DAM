package Clases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Clase05 {
    public static void main(String[] args) throws Exception {
        // Se puede declarr un ArrayList sin declarar tipos de dato. NO RECOMENDABLE
        ArrayList miLista = new ArrayList<>();
    
        miLista.add("Hola");
        miLista.add(31);
        miLista.add('d');
        miLista.add(5.5);

        // Aqui se declara el tipo de dato
        ArrayList<Integer> misEnteros = new ArrayList<Integer>();
    
        misEnteros.add(1);
        misEnteros.add(0, 1000); // Añade 1000 en la posicion 0
    
        // Otros métodos
        // Devuelve longitud de la lista
        miLista.size();
        // Devuelve la posicion x
        miLista.get(1);
        Object palabra = miLista.get(0);
        System.out.println(palabra);
        // Elimina la posicion x
        miLista.remove(1);
        // Elimina la primera ocurrencia del objeto X
        miLista.remove("perro");


        // HashMap
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Pedro", 1234);
        map.put("Luis", 12345);

        Iterator it = map.keySet().iterator();

        while(it.hasNext()) {
            String key = (String)it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }

        for (String key : map.keySet()) {
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }


    }
}
