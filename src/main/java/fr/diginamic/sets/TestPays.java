package fr.diginamic.sets;

import java.util.HashSet;
import java.util.List;

public class TestPays {
    public static void main(String[] args) {
        double plusGrandPIB = Double.MIN_VALUE;
        double plusPetitPIB = Double.MAX_VALUE;
        Pays paysGrandPIB, paysPetitPIB = null;

        HashSet<Pays> hPays = new HashSet<>(List.of(
                new Pays("USA", 339290000, 25400.0),
                new Pays("France", 68373433, 2370.500),
                new Pays("Allemagne", 84080000, 4121.00),
                new Pays("UK", 66870000, 3071.0),
                new Pays("Italie", 58860000, 2069),
                new Pays("Japon", 125120000, 4941),
                new Pays("Chine", 1425893465, 16531.76),
                new Pays("Russie", 143560000, 2240.0),
                new Pays("Inde", 1428627663, 3534.743)
        ));

        for (Pays value : hPays) {
            if (value.getPib() > plusGrandPIB) {
                plusGrandPIB = value.getPib();
                paysGrandPIB = value;
            }
            if (value.getPib() < plusPetitPIB) {
                plusPetitPIB = value.getPib();
                paysPetitPIB = value;
            }
        }

        paysPetitPIB.setNom(paysPetitPIB.getNom().toUpperCase());
        for (Pays value : hPays){
            System.out.println(value);
        }
        System.out.println("--------------------");
        hPays.remove(paysPetitPIB);
        for (Pays value : hPays){
            System.out.println(value);
        }
    }
}
