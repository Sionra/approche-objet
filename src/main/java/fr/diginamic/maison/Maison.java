package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
    private ArrayList<Piece> piece;

    public Maison() {
        this.piece = new ArrayList<>();
    }

    public void ajouterPiece(Piece piece) {
        if (piece != null) {
            if (piece.getSuperficie() > 0) {
                this.piece.add(piece);
            }
        }
    }

    public double superficieTotal() {
        double sup = 0;
        for (Piece p : this.piece) {
            sup += p.getSuperficie();
        }
        return sup;
    }

    public double superficieEtage(int etage) {
        double sup = 0;
        for (Piece p : this.piece) {
            if (p.getNumEtage() == etage) {
                sup += p.getSuperficie();
            }
        }
        return sup;
    }

    public double superficieSpecifique(Piece piece){
        double superficie = 0;
        for (Piece p : this.piece){
            if (p.getClass() == piece.getClass()){
                superficie += p.getSuperficie();
            }
        }
        return superficie;
    }

    public int nbTypePiece(Piece piece){
        int nb = 0;
        for (Piece p : this.piece){
            if (p.getClass() == piece.getClass()){
                nb++;
            }
        }
        return nb;
    }
}
