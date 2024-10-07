package fr.diginamic.entites;

public class Cercle {
    private double rayon;

    public Cercle(double rayon){
        this.rayon = rayon;
    }

    public double perimetre(){
        return 2 * Math.PI * this.rayon;
    }

    public double surface(){
        return Math.PI * Math.pow(this.rayon, 2);
    }
}
