package fr.diginamic.fichier;

public class Ville implements Comparable<Ville>{
    private String nom, nomRegion, codeDepartement;
    private int popTotal;

    public Ville(String nom, String nomRegion, String codeDepartement, int popTotal) {
        this.nom = nom;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.popTotal = popTotal;
    }

    @Override
    public String toString() {
        return this.nom + " | " + this.nomRegion + " | " + this.codeDepartement + " | " + this.popTotal;
    }

    public int getPopTotal() {
        return popTotal;
    }

    public String getNom() {
        return nom;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    @Override
    public int compareTo(Ville o) {
        return Integer.compare(o.popTotal, this.popTotal);
    }
}
