package fr.diginamic.sets;

public class Pays {
    private String nom;
    private int nbhabitant;
    private double pib;

    public Pays(String nom, int nbhabitant, double pib) {
        this.nom = nom;
        this.nbhabitant = nbhabitant;
        this.pib = pib;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Nom : " + this.nom + " | Habitant : " + this.nbhabitant + " | PIB : " + this.pib;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbhabitant() {
        return nbhabitant;
    }

    public void setNbhabitant(int nbhabitant) {
        this.nbhabitant = nbhabitant;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }
}
