package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {
    public static void main(String[] args) {
        List<Ville> listVille = new ArrayList<>();
        int index, plusHabitant, moinsHabitant;

        listVille.add(new Ville("Nice", 343000));
        listVille.add(new Ville("Carcassonne", 47800));
        listVille.add(new Ville("Narbonne", 53400));
        listVille.add(new Ville("Lyon", 484000));
        listVille.add(new Ville("Foix", 9700));
        listVille.add(new Ville("Pau", 77200));
        listVille.add(new Ville("Marseille", 850700));
        listVille.add(new Ville("Tarbes", 40600));

        plusHabitant = 0;
        index = 0;
        for (int i = 0; i < listVille.size(); i++) {
            if (listVille.get(i).getNbHabitant() > plusHabitant){
                plusHabitant = listVille.get(i).getNbHabitant();
                index = i;
            }
        }
        System.out.println("La ville la plus peuplé est : " + listVille.get(index).getNom() + " avec : " + listVille.get(index).getNbHabitant() + "Habitant");

        moinsHabitant = listVille.getFirst().getNbHabitant();
        index = 0;
        for (int i = 0; i < listVille.size(); i++) {
            if (listVille.get(i).getNbHabitant() < moinsHabitant){
                moinsHabitant = listVille.get(i).getNbHabitant();
                index = i;
            }
            if (listVille.get(i).getNbHabitant() >= 100000){
                listVille.get(i).setNom(listVille.get(i).getNom().toUpperCase());
            }
        }
        listVille.remove(index);

        for (Ville value : listVille){
            System.out.println(value);
        }
    }
}
