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

    public int getCompteNum() {
        return compteNum;
    }

    public void setCompteNum(int compteNum) {
        this.compteNum = compteNum;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
}
