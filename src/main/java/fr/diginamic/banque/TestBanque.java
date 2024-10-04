package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte unCompte = new Compte(1, 324.54);

        System.out.println(unCompte);
    }
}
