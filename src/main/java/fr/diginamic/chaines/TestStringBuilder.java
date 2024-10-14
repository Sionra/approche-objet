package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {

        long debut = System.currentTimeMillis();

        StringBuilder bString = new StringBuilder();
        String longString = "";

        for (int i = 1; i <= 100000; i++) {
            bString.append(i).append(';');
        }
        long fin = System.currentTimeMillis();

        long debut2 = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            longString += i;
        }

        long fin2 = System.currentTimeMillis();

        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
        System.out.println("Temps écoulé en millisecondes (String) :" + (fin2 - debut2));

    }
}
