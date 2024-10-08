package fr.diginamic.jdr;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Personnage player = null;
        Scanner input = new Scanner(System.in);
        int usrInput = 0;
        do {
            if (player == null) {
                System.out.println("Aucun personnage existant");
                System.out.println("--------------------");
                System.out.println("1 - Cree un personnage");
            } else {
                pStatus(player);
                System.out.println("2 - Combattre une creature");
            }
            System.out.println("0 - Quitter");
            System.out.println("--------------------");

            do {
                usrInput = input.nextInt();
            } while (usrInput < 0 || usrInput > 2);

            switch (usrInput) {
                case 1:
                    player = new Personnage();
                    break;
                case 2:
                    if (player != null){
                        if (!combat(player)){
                            player = null;
                        }
                    }
                    break;

            }
            System.out.println("--------------------");
        } while (usrInput != 0);

    }

    public static void pStatus(Personnage p1) {
        System.out.println("Pv : " + Color.ANSI_GREEN + p1.getPv() + '/' + p1.getPvmax() + Color.ANSI_RESET);
        System.out.println("Score : " + Color.ANSI_CYAN + p1.getScore() + Color.ANSI_RESET);
    }

    public static boolean combat(Personnage p1) {
        Creature monstre = null;
        Scanner input = new Scanner(System.in);
        int nbTour = 1;
        int rngPlayer, rngMonster;
        monstre = switch ((int) (Math.random() * 3) + 1) {
            case 1 -> new Loup();
            case 2 -> new Gobelin();
            case 3 -> new Troll();
            default -> monstre;
        };

        do {
            System.out.println("Tour : " + nbTour);
            rngPlayer = (int) (Math.random() * (10 - 1) + 1) + p1.getForce();
            rngMonster = (int) (Math.random() * (10 - 1) + 1) + monstre.getForce();
            if (rngPlayer > rngMonster) {
                //Le joueur Attaque
                System.out.println(Color.ANSI_YELLOW + "Le joueur attaque !" + Color.ANSI_RESET);
                System.out.println("Le " + monstre.getNom() + " subit " + Color.ANSI_RED + (rngPlayer - rngMonster) + Color.ANSI_RESET + " de Degat");
                monstre.coupSubit(rngPlayer - rngMonster);
            } else if ((p1.getForce() + rngPlayer) < (monstre.getForce() + rngMonster)) {
                //Le monstre attaque
                System.out.println(Color.ANSI_YELLOW + "Le monstre attaque !" + Color.ANSI_RESET);
                System.out.println("La Joueur subit " + Color.ANSI_RED + (rngMonster - rngPlayer) + Color.ANSI_RESET + " de Degat");
                p1.coupSubit(rngMonster - rngPlayer);
            } else {
                //Rien ne ce passe egualité
                System.out.println(Color.ANSI_YELLOW + "Rien ne ce passe vos force sont egals" + Color.ANSI_RESET);
            }
            System.out.println("--------------------");
            System.out.println("Pv joueur : " + Color.ANSI_GREEN + p1.getPv() + '/' + p1.getPvmax() + Color.ANSI_RESET);
            System.out.println("Pv " + monstre.getNom() + " : " + Color.ANSI_GREEN + monstre.getPv() + '/' + monstre.getPvMax() + Color.ANSI_RESET);
            System.out.println(Color.ANSI_GRAY + "Appuyer sur Entree pour continuer..." + Color.ANSI_RESET);
            input.nextLine();
            System.out.println("--------------------");
            nbTour++;
        } while (p1.getPv() > 0 && monstre.getPv() > 0);
        if (p1.getPv() > 0) {
            //Joueur gagne
            System.out.println(Color.ANSI_CYAN + "Le joueur gagne le combat !" + Color.ANSI_RESET);
            switch (monstre.getNom()) {
                case "Loup":
                    p1.addScore(1);
                    break;
                case "Gobelin":
                    p1.addScore(2);
                    break;
                case "Troll":
                    p1.addScore(5);
                    break;
            }
            System.out.println("Score actuelle : " + Color.ANSI_CYAN + p1.getScore() + Color.ANSI_RESET);
            return true;
        } else {
            //Joueur Perd
            System.out.println(Color.ANSI_RED + "Vous etes mort" + Color.ANSI_RESET);
            System.out.println("Score final : " + Color.ANSI_CYAN + p1.getScore() + Color.ANSI_RESET);
            return false;
        }
    }
}
