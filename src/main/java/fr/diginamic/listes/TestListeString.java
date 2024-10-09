package fr.diginamic.listes;

import java.util.ArrayList;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        int index, taille;
        listString.add("Nice");
        listString.add("Carcassonne");
        listString.add("Narbonne");
        listString.add("Lyon");
        listString.add("Foix");
        listString.add("Pau");
        listString.add("Marseille");
        listString.add("Tarbes");

        index = 0;
        taille = 0;
        for (int i = 0; i < listString.size(); i++) {
            if (listString.get(i).length() > taille) {
                taille = listString.get(i).length();
                index = i;
            }
        }
        System.out.println("Ville avec le plus grand nombre de lettre : " + listString.get(index));
        for (int i = 0; i < listString.size(); i++) {
            listString.set(i, listString.get(i).toUpperCase());
        }
        System.out.println(listString);

        for (int i = 0; i < listString.size(); i++) {
            if (listString.get(i).charAt(0) == 'N'){
                listString.remove(i);
            }
        }

        System.out.println(listString);
    }
}
