package fr.diginamic.jdr;

public class Personnage {
    private int force, pv, pvmax, score;

    public Personnage(){
        this.force = (int)(Math.random() * (18 - 12) + 12);
        this.pv = (int)(Math.random() * (50 - 20) + 20);
        this.pvmax = this.pv;
        this.score = 0;
    }

    public int getForce() {
        return force;
    }

    public int getPvmax() {
        return pvmax;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPv() {
        return pv;
    }

    public void coupSubit(int pv) {
        this.pv -= pv;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }
}
