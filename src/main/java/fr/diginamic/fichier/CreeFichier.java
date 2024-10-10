package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreeFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src", "main", "java", "fr", "diginamic", "fichier", "recensement.csv");
        ArrayList<String> ecriture = new ArrayList<>();

        if (Files.exists(path)) {
            List<String> contenu = Files.readAllLines(path);
            for (int i = 0; i < 100; i++) {
                ecriture.add(contenu.get(i));
            }
        }
        Path pathOut = Paths.get("src", "main", "java", "fr", "diginamic", "fichier", "centLigne.csv");
        Files.write(pathOut, ecriture);
    }
}
