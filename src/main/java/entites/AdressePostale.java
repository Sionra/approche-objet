package entites;

public class AdressePostale {
    private int nbRue, codePostal;
    private String nomRue, ville;

    public AdressePostale(int pnbRue, String pnomRue, int pcodePostal, String pville) {
        this.nbRue = pnbRue;
        this.codePostal = pcodePostal;
        this.nomRue = pnomRue;
        this.ville = pville;
    }
}
