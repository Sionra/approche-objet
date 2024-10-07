package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre myTheatre = new Theatre("La patte rouge", 100);

        System.out.println("Nombre de personne inscrite : " + myTheatre.getNbInscrit());
        System.out.println("Recette total : " + myTheatre.getRecette());
        myTheatre.inscrire(50, 350);
        System.out.println("--------------------");
        System.out.println("Nombre de personne inscrite : " + myTheatre.getNbInscrit());
        System.out.println("Recette total : " + myTheatre.getRecette());
        myTheatre.inscrire(10, 200);
        System.out.println("--------------------");
        System.out.println("Nombre de personne inscrite : " + myTheatre.getNbInscrit());
        System.out.println("Recette total : " + myTheatre.getRecette());
        myTheatre.inscrire(41, 211);
        System.out.println("--------------------");
        System.out.println("Nombre de personne inscrite : " + myTheatre.getNbInscrit());
        System.out.println("Recette total : " + myTheatre.getRecette());
        myTheatre.inscrire(40, 211);
        System.out.println("--------------------");
        System.out.println("Nombre de personne inscrite : " + myTheatre.getNbInscrit());
        System.out.println("Recette total : " + myTheatre.getRecette());
    }
}
