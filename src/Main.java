//import java.util.ArrayList;
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        // losowanie tablicy
//        ArrayList<Integer> listawyl = new ArrayList<>();
//        Random random = new Random();
//        int liczba;
//
//        while (listawyl.size() < 6) {
//            liczba = random.nextInt(1, 50);
//
//            if (listawyl.contains(liczba)) {
//                continue;
//            }
//
//            listawyl.add(liczba);
//        }
//
//        // wypisywanie
//        System.out.println("Tablica wylosowana:");
//
//        for (int elementtablicy : listawyl) {
//            System.out.println(elementtablicy);
//        }
//    }
//}
