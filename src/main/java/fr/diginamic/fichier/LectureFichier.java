package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src", "main", "java", "fr", "diginamic", "fichier", "recensement.csv");
        ArrayList<Ville> listVille = new ArrayList<>();
        ArrayList<String> outputVille = new ArrayList<>();

        List<String> contenu = Files.readAllLines(path);
        for (String value : contenu) {
            //System.out.println(value);
            String[] ligneActuelle = value.split(";");
            if (!ligneActuelle[0].equals("Code région")) {
                listVille.add(new Ville(ligneActuelle[6], ligneActuelle[1], ligneActuelle[2], Integer.parseInt(ligneActuelle[9].replaceAll("\\s+", ""))));
            }
        }
        System.out.println(listVille.size());
        Collections.sort(listVille);
        outputVille.add("Nom de la commune;Nom de la région;Code département;Population totale;");
        for (int i = 0; i < listVille.size(); i++) {
            if (listVille.get(i).getPopTotal() >= 25000) {
                outputVille.add(listVille.get(i).getNom() + ";" + listVille.get(i).getNomRegion() + ";" + listVille.get(i).getCodeDepartement() + ";" + listVille.get(i).getPopTotal());
            }
        }
        Path pathOut = Paths.get("src", "main", "java", "fr", "diginamic", "fichier", "result.csv");
        Files.write(pathOut, outputVille);
    }
}
