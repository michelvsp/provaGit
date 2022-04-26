package it.isa.progetto;
import java.util.stream.*;
import java.util.Optional; //Utile a count o find
/**
 * Hello world!
 *
 */
public class EsStream 
{
    public static void provaForEach(){
        Stream<String> parole = Stream.of("Edoardo", "di", "Caro");

        //Stampo lo stream
        parole.forEach(arg0 -> System.out.println(arg0));

        //Creo a partire da un array
        String[] arrayParole = {"Edoardo", "di", "Caro"};
        Stream<String> streamArray = Stream.of(arrayParole);

        //posso usare lista.stream() per ottenere uno stream da un lista

        streamArray.forEach(arg0 -> System.out.println(arg0));

        //Ho il metodo map per manipolare lo stream
        Stream<String> paroleInCaps = Stream.of(arrayParole).map(String::toUpperCase).map(s -> s.replace("A", "O"));

        paroleInCaps.forEach(arg0 -> System.out.println(arg0));
    }

    public static void provaInfiniti(){
        Stream<Double> numeri = Stream.generate(Math::random);

        numeri.limit(10).forEach(arg0 -> System.out.println(arg0));
    }

    public static void provaOptional(){
        Stream<Double> numeri = Stream.generate(Math::random).limit(10);
        Optional<Double> num = numeri.filter(x -> x > 1).findFirst();

        System.out.println(num.orElse((double) 0));
    }
    
    public static void esercizio(){
        /*Stampare le parole più lunghe di tre che iniziazo con la lettera a*/
        Stream<String> parole = Stream.of("Edoardo", "di", "Caro","are", "arianna");

        //al posto di arg0 di solito si usa x ma copilot consiglia così
        Stream<String> output = parole.filter(arg0 -> arg0.length() > 3).filter(arg0 -> arg0.startsWith("a"));

        System.out.println("OUTPUT ESERCIZIO: ");
        output.forEach(arg0 -> System.out.println(arg0));
    }

    public static void main (String args[])
    {
        System.out.println("Ciao sono il main di Collezioni");

        provaForEach();
        provaInfiniti();
        provaOptional();

        esercizio();
       
    }
}
