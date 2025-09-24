package app.battle;

import java.util.Random;

public class Attack implements Runnable {

    @Override
    public synchronized void run() {
        Random rand = new Random();
        int damage = rand.nextInt(5, 11); // Random damage between 10

        if(GameHandler.getBossHealth() <= 0) {
            System.out.println("The boss is already defeated. " + Thread.currentThread().getName() + " cannot attack.");
            return; // Boss already defeated
        }

        System.out.println(Thread.currentThread().getName() + " attacks the boss for " + damage + " damage.");
        GameHandler.setBossHealth(GameHandler.getBossHealth()-damage);
        if (GameHandler.getBossHealth() <= 0) {
            GameHandler.setBossHealth(0);
            System.out.println("The boss has been defeated!");
            try {
                // Simulate time taken to perform the attack
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " finished the attack.");
        }
    }
}
