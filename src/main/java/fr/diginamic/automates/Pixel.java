package fr.diginamic.automates;

public class Pixel {
    private boolean isAlive;

    public Pixel() {
        this.isAlive = false;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
