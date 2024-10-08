package fr.diginamic.maison;

public abstract class Piece {
    private double superficie;
    private int numEtage;

    public Piece(double superficie, int numEtage){
        this.superficie = superficie;
        this.numEtage = numEtage;
    }

    public int getNumEtage() {
        return numEtage;
    }

    public double getSuperficie() {
        return superficie;
    }
}
