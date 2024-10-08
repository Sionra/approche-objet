package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        Salarie sal;

        System.out.println("Character a l'index 0 est : " + chaine.charAt(0));
        System.out.println("Longeur de la chaine de charactere : " + chaine.length());
        System.out.println("Le premier ; et a l'index : " + chaine.indexOf(';'));
        System.out.println("Le nom de famille est : " + chaine.substring(0, chaine.indexOf(';')));
        System.out.println("Le nom de famille est : " + chaine.substring(0, chaine.indexOf(';')).toUpperCase());
        System.out.println("Le nom de famille est : " + chaine.substring(0, chaine.indexOf(';')).toLowerCase());

        String[] chaineSplit = chaine.split(";");
        sal = new Salarie(chaineSplit[0], chaineSplit[1], Double.parseDouble(chaineSplit[2].replace(" ", "")));
        System.out.println(sal);
    }
}
