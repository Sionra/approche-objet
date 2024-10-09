package fr.diginamic.tri;

import fr.diginamic.tri.Ville;

import java.util.*;

public class TestVilles {
    public static void main(String[] args) {
        List<Ville> listVille = new ArrayList<>();
        int index, plusHabitant, moinsHabitant;
        boolean change = false;

        listVille.add(new Ville("Nice", 343000));
        listVille.add(new Ville("Carcassonne", 47800));
        listVille.add(new Ville("Narbonne", 53400));
        listVille.add(new Ville("Lyon", 484000));
        listVille.add(new Ville("Foix", 9700));
        listVille.add(new Ville("Pau", 77200));
        listVille.add(new Ville("Marseille", 850700));
        listVille.add(new Ville("Tarbes", 40600));

        Collections.sort(listVille);
        for (Ville value : listVille){
            System.out.println(value);
        }

    }
}
