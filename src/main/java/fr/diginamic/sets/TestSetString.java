package fr.diginamic.sets;

import java.util.HashSet;
import java.util.List;

public class TestSetString {
    public static void main(String[] args) {
        int nbChar = Integer.MIN_VALUE;
        String temp = null;
        HashSet<String> hString = new HashSet<>(List.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

        for (String value : hString){
            if (value.length() > nbChar){
                nbChar = value.length();
                temp = value;
            }
        }
        hString.remove(temp);
        System.out.println(hString);
    }
}
