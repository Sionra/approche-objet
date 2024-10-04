package entites;

public class Personne {
    private String nom, prenom;
    private AdressePostale adr;

    public Personne(String pNom, String pPrenom, AdressePostale pAdr) {
        this.nom = pNom;
        this.prenom = pPrenom;
        this.adr = pAdr;
    }

    public Personne(String pNom, String pPrenom){
        this.nom = pNom;
        this.prenom = pPrenom;
    }

   public void afficher(){
       System.out.println("Nom : " + this.nom.toUpperCase());
       System.out.println("Prenom : " + this.prenom);
   }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdr(AdressePostale adr) {
        this.adr = adr;
    }

    public String getNom() {
        return nom;
    }

    public AdressePostale getAdr() {
        return adr;
    }

    public String getPrenom() {
        return prenom;
    }
}
