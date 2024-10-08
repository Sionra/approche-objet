package fr.diginamic.salaire;

public class Salarie extends Intervenant{
    double salaire;
    String status;

    public Salarie(String nom, String prenom, double salaire, String status){
        super(nom, prenom);
        this.salaire = salaire;
        this.status = status;
    }

    public  void afficherDonnees(){
        super.afficherDonnees();
        System.out.println("Salaire : " + this.salaire + "\nStatus : Salarie en " + this.status);
    }

    @Override
    public double getSalaire() {
        return this.salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
