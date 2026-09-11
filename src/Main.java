import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Gra gra = new Gra();

        gra.wpiszliczby();
        System.out.println("Wylosowane " + Gra.getWylosowane());
        System.out.println("Wpisane " + gra.getWpisane());
        System.out.println("Trafione " + gra.zwroctrafione());

    }
}
