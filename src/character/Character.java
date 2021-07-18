package character;

import map.Map;
import map.Tile;

public abstract class Character {

    public int heath;
    public int attackDamage;
    public int maxHealth;
    public Map map;
    public Tile position;

    public Character(Map map) {
        this.map = map;
    }

    public Tile getPosition() {
        return position;
    }

    public void jump(int direction) {
        if (Math.abs(direction) > 1) {
            throw new ArithmeticException();
        }
        position = map.getNextTile(position, direction*2);
    }

    public void move(int direction) {
        if (Math.abs(direction) > 1) {
            throw new ArithmeticException();
        }
        position = map.getNextTile(position, direction);
    }

    public void attack(int i) {

    }

    public abstract String getStat();
}
