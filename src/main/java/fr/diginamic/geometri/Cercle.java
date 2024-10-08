package fr.diginamic.geometri;

public class Cercle implements ObjetGeometrique {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * this.rayon;
    }

    @Override
    public double surface() {
        return Math.PI * Math.pow(this.rayon, 2);
    }
}
