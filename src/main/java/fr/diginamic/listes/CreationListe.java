package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();

        for (int i = 1; i < 101; i++) {
            listInt.add(i);
        }
        System.out.println(listInt.size());

    }
}
