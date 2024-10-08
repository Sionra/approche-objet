package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maMaison = new Maison();

        maMaison.ajouterPiece(new Chambre(10, 0));
        maMaison.ajouterPiece(new Chambre(10, 1));
        maMaison.ajouterPiece(new Salon(30, 0));
        maMaison.ajouterPiece(new Wc(3, 0));
        maMaison.ajouterPiece(new SalleDeBain(15, 1));
        maMaison.ajouterPiece(new Cuisine(20, 1));
        maMaison.ajouterPiece(new Cuisine(-20, 1));
        maMaison.ajouterPiece(null);

        System.out.println(maMaison.superficieEtage(0));
        System.out.println("--------------------");
        System.out.println(maMaison.superficieEtage(1));
        System.out.println("--------------------");
        System.out.println(maMaison.superficieTotal());
        System.out.println("--------------------");
        System.out.println(maMaison.superficieSpecifique(new Chambre(0, 0)));
        System.out.println("--------------------");
        System.out.println(maMaison.nbTypePiece(new Chambre(0, 0)));
    }
}
