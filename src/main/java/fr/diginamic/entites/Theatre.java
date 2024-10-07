package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capaMax, nbInscrit;
    private double recette;

    public  Theatre(String nom , int capaMax){
        this.nom = nom;
        this.capaMax = capaMax;
        this.nbInscrit = 0;
        this.recette = 0;
    }

    public void inscrire(int nbClient, double prix){
        if ( nbClient + this.nbInscrit > this.capaMax){
            System.err.println("Erreur, trop de client");
        } else {
            this.nbInscrit +=  nbClient;
            this.recette += prix * nbClient;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapaMax() {
        return capaMax;
    }

    public void setCapaMax(int capaMax) {
        this.capaMax = capaMax;
    }

    public int getNbInscrit() {
        return nbInscrit;
    }

    public void setNbInscrit(int nbInscrit) {
        this.nbInscrit = nbInscrit;
    }

    public double getRecette() {
        return recette;
    }

    public void setRecette(double recette) {
        this.recette = recette;
    }

}
