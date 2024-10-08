package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    private int nbJour;
    private double tauxJour;

    public Pigiste ( String nom, String prenom, int nbJour, double tauxJour){
        super(nom, prenom);
        this.nbJour = nbJour;
        this.tauxJour = tauxJour;
    }
    public  void afficherDonnees(){
        super.afficherDonnees();
        System.out.println("Salaire : " + this.getSalaire() + "\nStatus : Pigiste");
    }

    @Override
    public double getSalaire() {
        return this.nbJour * this.tauxJour;
    }
}
