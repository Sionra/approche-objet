package fr.diginamic.geometri;

import java.util.ArrayList;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ArrayList<ObjetGeometrique> geoArray = new ArrayList<>();

        geoArray.add(new Cercle(5));
        geoArray.add(new Rectangle(3, 8));

        for (ObjetGeometrique value : geoArray){
            System.out.println("Perimetre : " + Color.ANSI_BLUE + value.perimetre() + Color.ANSI_RESET);
            System.out.println("Surface : " + Color.ANSI_BLUE + value.surface() + Color.ANSI_RESET);
        }
    }
}
