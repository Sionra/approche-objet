package fr.diginamic.salaire;

public abstract  class Intervenant {
    String nom, prenom;

    public Intervenant (String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public void afficherDonnees(){
        System.out.println("Nom : " + this.nom + "\nPrenom : " + this.prenom);
    }

    public abstract double getSalaire();

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
