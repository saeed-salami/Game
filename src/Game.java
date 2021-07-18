import character.Character;
import character.Enemy;
import character.Player;
import map.Map;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Map map = new Map(10);
        ArrayList<Character> characters = new ArrayList<>();
        Player player = new Player(map , map.getRandomNonOccupiedTile());
        characters.add(player);
        for (int i = 0; i < 3; i++) {
            Enemy enemy = new Enemy(map ,map.getRandomNonOccupiedTile());
            characters.add(enemy);
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = getInput(scanner);
            process(input, player);
            showResult(map,characters);
        }

    }

    private static void showResult(Map map, ArrayList<Character> characters) {
        for (int i = 0; i < map.getSize(); i++) {
            boolean isCharacterInside = false;
            for (Character character : characters) {
                if (character.getPosition().getX()==i)
                System.out.print(character.getStat());
                isCharacterInside =true;
            }
            if (isCharacterInside)
            System.out.print("|___|");
        }
    }

    private static void process(String input, Player player) {
        if (input.equals("right")) {
            player.move(1);
        } else if (input.equals("left")) {
            player.move(-1);
        } else if (input.equals("jumpr")) {
            player.move(1);

        } else if (input.equals("jumpl")) {
            player.move(-1);

        } else if (input.equals("attackr")) {
            player.attack(1);

        }else if (input.equals("attackl")){
            player.attack(-1);

        }
    }

    private static String getInput(Scanner scanner) {
        String input = scanner.nextLine();
        //TODO validation
        return input;
    }
}
