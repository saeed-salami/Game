package map;

import gameObjects.Potion;

public class Tile {

    int x;
    public boolean occupied;
    Potion potion;

    public Tile(int i) {
        this.x = i;
        occupied = false;
    }

    public int getX() {
        return x;
    }
}
