package entites;

public class TestPersonne {
    public static void main(String[] args) {
        Personne per1 = new Personne("Rhouye", "Paht", new AdressePostale(25, "Jean", 21234, "Imaginaire"));
        Personne per2 = new Personne("Bistro", "Alonzo");

        per2.setAdr(new AdressePostale(34, "Phillipe", 72854, "Pointaigue"));

        per1.afficher();
        per2.afficher();
    }
}
