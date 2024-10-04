package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne per1 = new Personne("Rhouye", "Paht", new AdressePostale(25, "Jean", 21234, "Imaginaire"));
        Personne per2 = new Personne("Bistro", "Alonzo", new AdressePostale(34, "Phillipe", 72854, "Pointaigue"));
    }
}
