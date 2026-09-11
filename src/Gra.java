import java.util.*;

public class Gra {
    private static HashSet<Integer> wylosowane;



    private ArrayList<Integer> wpisane;



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
    public static HashSet<Integer> getWylosowane() {
        return wylosowane;
    }
    public ArrayList<Integer> getWpisane() {
        return wpisane;
    }

    public void wpiszliczby(){
        Scanner scanner = new Scanner(System.in);
        wpisane = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj liczbe " +  (i + 1));
            liczba = scanner.nextInt();
            while (wpisane.contains(liczba)){
                System.out.println("Taka liczba juz byla podaj inna");
                liczba = scanner.nextInt();;
            }
            wpisane.add(liczba);
        }

    }
    private LinkedList<Integer> zwroctrafione(){
        LinkedList<Integer> trafione = new LinkedList<>();
        for (Integer wylosowane:wylosowane){
            if(wpisane.contains(wylosowane)){
                trafione.add(wylosowane);
            }

        }
        return trafione;
    }
    public LinkedList<Integer> zagraj(){

        wpiszliczby();
        System.out.println("wpisane: " + wpisane);
        System.out.println("wlosowane: " + wylosowane);
        System.out.println("trafione: " + zwroctrafione());

        return zwroctrafione();
    }
}
