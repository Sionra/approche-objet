package fr.diginamic.tri;

public class Ville implements Comparable<Ville>{
    private String nom;
    private int nbHabitant;

    public Ville(String nom, int nbHabitant) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
    }

    @Override
    public String toString() {
        return "Ville : " + this.nom + " | Habitant : " + this.nbHabitant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(int nbHabitant) {
        this.nbHabitant = nbHabitant;
    }

    @Override
    public int compareTo(Ville o) {
        //return this.nom.compareTo(o.getNom());
        if (this.nbHabitant > o.getNbHabitant()){
            return 1;
        } else if (this.nbHabitant == o.getNbHabitant()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ville villeObj)){
            return false;
        } else {
            return (this.nom.equals(villeObj.getNom()) && this.nbHabitant == villeObj.getNbHabitant());
        }
    }
}
