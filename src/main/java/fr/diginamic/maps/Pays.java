package fr.diginamic.maps;

public class Pays {
    private String nom, continent;
    private int nbHabitant;

    public Pays(String nom, String continent, int nbHabitant) {
        this.nom = nom;
        this.continent = continent;
        this.nbHabitant = nbHabitant;
    }

    public String getContinent() {
        return continent;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }
}
