package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String[] args) {
        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");
//TODO Développements à réaliser ci-dessous

      List<String> liste3 = new ArrayList<>();
        for (int i = 0; i < liste1.size(); i++) {
            liste3.add(liste1.get(i));
            liste3.add(liste2.get(i));
        }

        for (String value : liste3){
            System.out.println(value);
        }
    }
}
