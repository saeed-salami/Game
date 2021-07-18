package character;

import map.Map;
import map.Tile;

public class Enemy extends Character{
    public Enemy(Map map, Tile position) {
        super(map);
        this.position = position;
        position.occupied =true;
    }

    @Override
    public String getStat() {
        return "E["+heath+"]";
    }
}
