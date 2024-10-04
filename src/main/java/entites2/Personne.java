package entites2;

import entites.AdressePostale;

public class Personne {
    private String nom, prenom;
    private AdressePostale adr;

    public Personne(String pNom, String pPrenom, AdressePostale pAdr) {
        this.nom = pNom;
        this.prenom = pPrenom;
        this.adr = pAdr;
    }
}
