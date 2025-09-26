package app.battle;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Attack implements Runnable {

    @Override
    public void run() {
        if(GameHandler.getBossHealth() <= 0) {
            System.out.println("The boss is already defeated. " + Thread.currentThread().getName() + " cannot attack.");
            return; // Boss already defeated
        }

        int damage = ThreadLocalRandom.current().nextInt(5,11); // Random damage between 5 and 10 per thread random.
        System.out.println(Thread.currentThread().getName() + " attacks the boss for " + damage + " damage.");
        GameHandler.dealDamage(damage);
    }
}
