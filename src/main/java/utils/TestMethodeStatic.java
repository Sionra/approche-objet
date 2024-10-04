package utils;

import java.util.stream.IntStream;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "7";
        int chaineConverti = Integer.parseInt(chaine);
        System.out.println(chaineConverti);
        int a = 10;
        int b = 42;

        System.out.println("Le nombre maximum entre " + a + " et " + b + " est : " + Integer.max(a, b));
    }
}
