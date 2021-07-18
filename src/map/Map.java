package map;
import java.util.ArrayList;
import java.util.Collections;

public class Map {

    ArrayList<Tile> tiles;
    int size;

    public int getSize() {
        return size;
    }

    public Tile getRandomNonOccupiedTile(){
        ArrayList<Tile> nonOccupiedTiles = new ArrayList<>();
        for (Tile tile : tiles) {
            if (!tile.occupied){
                nonOccupiedTiles.add(tile);
            }
        }
        Collections.shuffle(nonOccupiedTiles);
        return nonOccupiedTiles.get(0);
    }

    public Map(int dimension) {
        this.tiles = new ArrayList<Tile>();
        for (int i = 0; i < dimension; i++) {
            tiles.add(new Tile(i));
        }
        this.size = tiles.size();
    }

    public Tile getNextTile(Tile position, int direction) {
        for (int i = 0; i < tiles.size(); i++) {
            if (tiles.get(i)==position){
                return tiles.get((i+direction)% size);
            }
        }
        return null;
    }
}
