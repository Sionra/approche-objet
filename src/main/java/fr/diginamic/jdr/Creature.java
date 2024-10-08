package fr.diginamic.jdr;

public abstract class Creature {
    private int force, pv, pvMax;
    private final String nom;

    public Creature(int force, int pv, String nom){
        this.force = force;
        this.pv = pv;
        this.pvMax = pv;
        this.nom = nom;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public int getPv() {
        return pv;
    }

    public void coupSubit(int pv) {
        this.pv -= pv;
    }
}
