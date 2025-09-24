package app;

import app.battle.GameHandler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main implements Runnable{

    private int count = 0;
    private int countSync = 0;
    private static int threads = 4;

    private static ExecutorService executor = Executors.newFixedThreadPool(threads);

    public static void main(String[] args) {
        //Creates runnable instance of main
        Runnable task = new Main();
        //Sets those instances as threads
        Thread T1 = new Thread(task);
        Thread T2 = new Thread(task);
        //Start threads using instances.
        T1.start();
        T2.start();

        //Create many threads.
        for(int i = 0; i <= ((Main) task).threads; i++){
            Thread T = new Thread(task);
            T.start();
        }

        executor.submit(task);

        executor.shutdown();

        GameHandler.startGame();
    }

    @Override
    public void run() {
        System.out.println("Running in thread: " + Thread.currentThread().getName());
        //Adding to count without synchronization
        count++;
        System.out.println("Count is: " + count);

        //Incrementing count using synchronized method
        increment();
    }

    //Synchronized method to increment count(Will stop race conditions.)
    public synchronized void increment(){
        countSync++;
        System.out.println("Count after incrementing is: " + countSync);
    }
}