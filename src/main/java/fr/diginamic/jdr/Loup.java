package fr.diginamic.jdr;

public class Loup extends Creature{

    public Loup(){
        super((int)(Math.random() * (8 - 3) + 3),
                (int)(Math.random() * (10 - 5) + 5),
                "Loup");
    }
}
