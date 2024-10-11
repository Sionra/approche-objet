package fr.diginamic.automates;

import java.util.ArrayList;
import java.util.List;

class Position {
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Pixel getPixel(Grid grid){
        return grid.getPixel(this.x, this.y);
    }

    public boolean isAlive(Grid grid){
        Pixel pixel = getPixel(grid);

        if (pixel == null){
            return false;
        }

        return pixel.isAlive();
    }

    public List<Pixel> getNeighborPixels(Grid grid){
        List<Pixel> pixels = new ArrayList<>();

        for (int dx = -1; dx <= 1; dx++){
            for (int dy = -1; dy <= 1; dy++){
                if (dx == 0 && dy == 0) continue;

                Pixel pixel = grid.getPixel(this.x+dx, this.y+dy);

                if (pixel != null){
                    pixels.add(pixel);
                }
            }
        }
        return pixels;
    }

    public void setAlive(Grid grid, boolean alive){
        Pixel pixel = getPixel(grid);

        if (pixel == null){
            return;
        }

        pixel.setAlive(alive);
    }
    public Position up(){
        return new Position(this.x, this.y - 1);
    }

    public Position right(){
        return new Position(this.x + 1, this.y);
    }

    public Position down(){
        return new Position(this.x, this.y + 1);
    }

    public Position left(){
        return new Position(this.x - 1, this.y);
    }

    public Position north(){ return up(); }
    public Position east(){ return right(); }
    public Position south(){ return down(); }
    public Position west(){ return left(); }

}
