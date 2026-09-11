import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Gra {
    private static HashSet<Integer> wylosowane;

    public static HashSet<Integer> getWylosowane() {
        return wylosowane;
    }

    private ArrayList<Integer> wpisane;

    public ArrayList<Integer> getWpisane() {
        return wpisane;
    }

    public Gra() {
        if (wylosowane == null){
            wylosujliczby();
        }
        wpisane = new ArrayList<>();
    }

    /**
     * nazwa: wylosujliczby
     * opis: metoda losuje 6 liczb
     * parametry: brak
     * zwracan wartosc: brak
     * autor: 009
     */


    private void wylosujliczby(){
        Random random = new Random();
        wylosowane = new HashSet<>();
        while (wylosowane.size() != 6){
            wylosowane.add(random.nextInt(1,50));
        }
    }
}
