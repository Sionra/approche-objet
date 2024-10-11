package fr.diginamic.automates;

public class Grid {
    private Pixel[][] pixels;
    private int size;

    public Grid(int size) {
        this.pixels = new Pixel[size][size];
        this.size = size;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                this.pixels[y][x] = new Pixel();
            }
        }
    }

    public Pixel getPixel(int x, int y) {
        if ((x < 0 || x > this.size-1) || (y < 0 || y > this.size-1)){
            return null;
        }
        return this.pixels[y][x];
    }

    public int size(){
        return this.size;
    }
}
