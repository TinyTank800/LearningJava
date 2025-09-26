package app.battle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class GameHandler {

    private static final AtomicInteger bossHealth = new AtomicInteger(100);
    private static final AtomicBoolean defeatedAnnounced = new AtomicBoolean(false);
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

        while (bossHealth.get() > 0) {
            try {
                game.invokeAll(attacks);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Boss health is now: " + bossHealth);
        }

        game.shutdown();
    }

    static int getBossHealth() {
        return bossHealth.get();
    }

    static void dealDamage(int amount) {
        int remaining = bossHealth.updateAndGet(h -> Math.max(0, h - amount));
        if (remaining == 0 && defeatedAnnounced.compareAndSet(false, true)) {
            System.out.println("The boss has been defeated!");
        }
    }
}
