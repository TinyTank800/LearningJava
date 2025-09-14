import classes.Warrior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final List<Warrior> players = new ArrayList<>(List.of(new Warrior(), new Warrior(), new Warrior()));
    private static final Random random = new Random();

    public static void main(String[] args) {
        initializeGame();

        startGame();
    }

    public static void initializeGame() {
        for (int i = 0; i < players.size(); i++) {
            Warrior w = players.get(i);
            w.setName("Player " + (i + 1));
            w.setHealth(100);
            System.out.println(w.getName() + " has " + w.getHealth() + " health.");
        }
    }

    public static void startGame() {
        while (players.size() > 1) {
            Warrior attacker;
            Warrior opponent;
            do{
                attacker = players.get(random.nextInt(players.size()));
                opponent = players.get(random.nextInt(players.size()));
            } while (opponent == attacker);

            attacker.attack(opponent);

            if (opponent.getHealth() <= 0) {
                System.out.println(opponent.getName() + " has been defeated!");
                players.remove(opponent);
            }

            if (players.size() == 1) {
                System.out.println(attacker.getName() + " is the last player standing and wins the game with " + attacker.getHealth() + " health remaining!");
                return;
            }
        }
    }
}