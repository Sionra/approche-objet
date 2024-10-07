package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double taux;

    public CompteTaux(int compteNum, double soldeCompte, double taux) {
        super(compteNum, soldeCompte);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaux de rémunération : " + this.taux + '%';
    }
}
