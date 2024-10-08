package fr.diginamic.geometri;

public class Rectangle implements ObjetGeometrique {
    int longueur, largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return this.longueur * 2 + this.largeur * 2;
    }

    @Override
    public double surface() {
        return this.largeur * this.largeur;
    }
}
