package fr.diginamic.banque.entites;

public class Compte {
    private int compteNum;
    private double soldeCompte;

    public Compte(int compteNum, double soldeCompte) {
        this.compteNum = compteNum;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Numéro du compte : " + this.compteNum + "\nSolde : " + this.soldeCompte + "€";
    }
}
