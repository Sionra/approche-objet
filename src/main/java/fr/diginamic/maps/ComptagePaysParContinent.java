package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        List<Pays> listPays = new ArrayList<>();
        HashMap<String, Integer> paysCount = new HashMap<>();

        listPays.add(new Pays("France", "Europe", 65));
        listPays.add(new Pays("Allemagne", "Europe", 80));
        listPays.add(new Pays("Belgique", "Europe", 10));
        listPays.add(new Pays("Russie", "Asie", 150));
        listPays.add(new Pays("Chine", "Asie", 1400));
        listPays.add(new Pays("Indonésie", "Océanique", 220));
        listPays.add(new Pays("Australie", "Océanique", 20));

        for (Pays value : listPays){
            if (paysCount.containsKey(value.getContinent())){
                paysCount.put(value.getContinent(), value.getNbHabitant() + paysCount.get(value.getContinent()));
            } else {
                paysCount.put(value.getContinent(), value.getNbHabitant());
            }
        }

        for (String key : paysCount.keySet()){
            System.out.println("Clé : " + key + " | Habitant : " + paysCount.get(key));
        }
    }
}
