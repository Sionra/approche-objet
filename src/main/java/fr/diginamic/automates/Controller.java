package fr.diginamic.automates;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Controller {
    private Grid pixels;
    boolean running;
    AfficherGrille affichage;

    public Controller() {
        this.pixels = new Grid(30);
        this.running = true;
        this.affichage = new AfficherGrille(this.pixels);
    }

    public void run() throws IOException {
        menu();
        while (this.running) {
            nextStep();
            System.out.println("Appuyer sur entrée pour continuer la simulation");
            new Scanner(System.in).nextLine();
        }
    }

    public void nextStep() {
        Grid temp = new Grid(30);

        for (int x = 0; x < this.pixels.size(); x++) {
            for (int y = 0; y < this.pixels.size(); y++) {
                Position pos = new Position(x, y);
                int nbAlive = getNumNeighbors(pos);
                if (pos.isAlive(this.pixels)) {
                    if (nbAlive >= 4 || nbAlive < 2) {
                        pos.setAlive(temp, false);
                    } else {
                        pos.setAlive(temp, true);
                    }
                } else {
                    if (nbAlive == 3) {
                        pos.setAlive(temp, true);
                    }
                }
            }
        }
        for (int x = 0; x < this.pixels.size(); x++) {
            for (int y = 0; y < this.pixels.size(); y++) {
                Pixel pixel = this.pixels.getPixel(x, y);

                pixel.setAlive(temp.getPixel(x, y).isAlive());
            }
        }
        this.affichage.afficher();
    }

    public void menu() throws IOException {
        Scanner scan = new Scanner(System.in);
        Pixel pixel;
        int usrInputx = 0;
        int usrInputy = 0;
        String usrInput = "";

        System.out.println("1. Utiliser son jeux de fichier");
        System.out.println("2. cree sa propre configuration");
        switch (scan.nextInt()) {
            case 1: // configuration lecture de fichier
                Path directory = Paths.get("src/main/java/fr/diginamic/automates");
                Stream<Path> list = Files.list(directory);
                Object[] patate = list.toArray();
                ArrayList<Path> listFile = new ArrayList<>();
                Scanner input = new Scanner(System.in);
                int usrint;
                int numberFound = 1;
                for (int i = 0; i < patate.length; i++) {
                    if (((Path) patate[i]).getFileName().toString().endsWith(".txt")) {
                        System.out.println(numberFound + ". " + ((Path) patate[i]).getFileName());
                        listFile.add(((Path) patate[i]));
                        numberFound++;
                    }
                }
                do {
                    System.out.println("Quel fichier utiliser ?");
                    usrint = input.nextInt();
                } while (usrint <= 0 || usrint > numberFound);
                List<String> contenu = Files.readAllLines(listFile.get(usrint - 1));
                for (int x = 0; x < contenu.size(); x++) {
                    for (int y = 0; y < contenu.get(x).length(); y++) {
                        if (contenu.get(x).charAt(y) == 'x') {
                            this.pixels.getPixel(x, y).setAlive(true);
                        }
                    }
                }
                this.affichage.afficher();

                break;
            case 2: // configuration custom
                System.out.println("ou voulez vous placer un pixel (debut a 0) : ");
                do {
                    do {
                        System.out.print(" X : ");
                        usrInputx = scan.nextInt();
                        System.out.print(" Y : ");
                        usrInputy = scan.nextInt();
                        pixel = this.pixels.getPixel(usrInputx, usrInputy);
                    } while (pixel == null);
                    pixel.setAlive(true);
                    this.affichage.afficher();
                    System.out.println("Ajouter un nouveau pixel ? Y/N");
                    usrInput = new Scanner(System.in).nextLine();
                } while (usrInput.equals("Y"));
        }
    }

    private int getNumNeighbors(Position position) {
        List<Pixel> neighbors = position.getNeighborPixels(this.pixels);
        int alive = 0;

        for (Pixel pixel : neighbors) {
            if (pixel.isAlive()) {
                alive++;
            }
        }
        return alive;
    }
}
