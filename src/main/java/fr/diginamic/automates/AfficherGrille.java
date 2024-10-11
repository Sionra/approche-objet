package fr.diginamic.automates;

public class AfficherGrille {
    private Grid pixels;

    public AfficherGrille(Grid pixels){
        this.pixels = pixels;
    }

    public void afficher(){
        StringBuilder affichage = new StringBuilder();
        affichage.append("┌");
        for (int i = 0; i < this.pixels.size(); i++){
            affichage.append('─');
        }
        affichage.append("┐\n");
        for (int y = 0; y < this.pixels.size(); y++){
            affichage.append('│');
            for (int x = 0; x < this.pixels.size(); x++){
                if (this.pixels.getPixel(x, y).isAlive()){
                    affichage.append('x');
                } else {
                    affichage.append(' ');
                }
            }
            affichage.append("│\n");
        }
        affichage.append("└");
        for (int i = 0; i < pixels.size(); i++){
            affichage.append('─');
        }
        affichage.append("┘\n");
        System.out.println(affichage);
    }

}
