package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.util.ArrayList;

public class TestBanque {
    public static void main(String[] args) {
        Compte unCompte = new Compte(1, 324.54);
        ArrayList<Compte> compteArray = new ArrayList<>();

        compteArray.add(unCompte);
        compteArray.add(new CompteTaux(2, 2948.23, 2.3));

//        System.out.println(unCompte);
        for (Compte val : compteArray){
            System.out.println(val);
            System.out.println("----------------------------------------");
        }
    }
}
