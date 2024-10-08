package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie s1 = new Salarie("Sionra", "Cadish", 2000, "CDI");
        Pigiste p1 = new Pigiste("Patate", "Fraise", 3, 100);

        System.out.println(s1.getSalaire());
        System.out.println("--------------------");
        System.out.println(p1.getSalaire());
        System.out.println("--------------------");

        s1.afficherDonnees();
        System.out.println("--------------------");
        p1.afficherDonnees();
    }
}
