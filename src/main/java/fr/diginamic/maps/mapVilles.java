package fr.diginamic.maps;

import java.util.HashMap;

public class mapVilles {
    public static void main(String[] args) {
        HashMap<String, Integer> mapVille = new HashMap<>();
        int plusPetit = Integer.MAX_VALUE;
        String cleDelete = "";
        mapVille.put("Nice", 343000);
        mapVille.put("Carcassonne", 47800);
        mapVille.put("Narbonne", 53400);
        mapVille.put("Lyon", 484000);
        mapVille.put("Foix", 9700);
        mapVille.put("Pau", 77200);
        mapVille.put("Marseille", 850700);
        mapVille.put("Tarbes", 40600);

        for (String key : mapVille.keySet()){
            if (mapVille.get(key) < plusPetit){
                cleDelete = key;
            }
        }
        mapVille.remove(cleDelete);

        for (String key : mapVille.keySet()){
            System.out.println("Clé : " + key + " | Habitant : " + mapVille.get(key));
        }
    }
}
