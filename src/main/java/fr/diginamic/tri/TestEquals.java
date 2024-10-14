package fr.diginamic.tri;

public class TestEquals {
    public static void main(String[] args) {

        Ville v1 = new Ville("PatateLand", 100);
        Ville v2 = new Ville("FraiseLand", 300);
        Ville v3 = new Ville("PatateLand", 300);
        Ville v4 = new Ville("PatateLand", 100);

        System.out.println(v1.equals(v4));
        System.out.println(v1.equals(v3));

        System.out.println(v1 == v3);
        System.out.println(v1 == v4);

    }
}
