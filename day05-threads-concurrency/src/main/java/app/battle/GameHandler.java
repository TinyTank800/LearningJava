package app.battle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GameHandler {

    private static int bossHealth= 100;
    private static int players = 5;
    
    private static ExecutorService game = Executors.newFixedThreadPool(players);


    
    public static void startGame(){
        System.out.println("Game started with " + players + " players!");
        List<Callable<Void>> attacks = new ArrayList<>();
        for(int i = 0; i < players; i++){
            attacks.add(() -> {
                new Attack().run();
                return null;
            });
        }

        while (bossHealth > 0) {
            try {
                game.invokeAll(attacks);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Boss health is now: " + bossHealth);
        }

        game.shutdown();
    }

    public synchronized static int getBossHealth() {
        return bossHealth;
    }

    public synchronized static void setBossHealth(int health) {
        bossHealth = health;
    }
}
