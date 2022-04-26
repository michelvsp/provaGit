package it.isa.progetto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class Collezioni {

    public static void liste(){
        List<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        lista.add("elena");

        //Altro modo di creare una lista (partendo da un array)
        String [] paroleArray =  {
            "Edoardo",
            "di",
            "Caro"
        };
        List<String> lista2 = new ArrayList<>(Arrays.asList(paroleArray));

        //Stampo la lista
        System.out.println(lista.size());

        //Stampo la lista (usando lambda expression)
        lista.forEach(x -> System.out.println(x));

        //Rimuovo alcuni elementi (quelli più lunghi di 1 caratteri)
        lista.removeIf(x -> x.length() > 1);

        System.out.println("Dopo la rimozione");
        lista.forEach(x -> System.out.println(x));

        //Creiamo una mappa
        Map<String, String> mappa = new HashMap<String,String>();
        mappa.put("key1", "value1");
        mappa.put("key2", "value2");
        mappa.put("key3", "value3");
    }

    /*
    public static void main (String args[])
    {
        System.out.println("Ciao sono il main di Collezioni");
        Collezioni.liste();
    }
    */
}
