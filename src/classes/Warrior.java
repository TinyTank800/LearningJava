package classes;

import data.Player;

import java.util.Random;

public class Warrior extends Player {
    private final Random random = new Random();

    public int getAttackPower() {
        return random.nextInt(10, 21); // Attack power between 10 and 20
    }

    public void attack(Player opponent) {
        int dmg = this.getAttackPower();
        opponent.setHealth(opponent.getHealth() - dmg);
        System.out.println(this.getName() + " attacks " + opponent.getName() + " for " + dmg + " damage.");
    }
}
