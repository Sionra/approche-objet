package fr.diginamic.jdr;

public class Gobelin extends Creature{

    public Gobelin(){
        super((int)(Math.random() * (10 - 5) + 5),
                (int)(Math.random() * (15 - 10) + 10),
                "Gobelin");
    }
}
