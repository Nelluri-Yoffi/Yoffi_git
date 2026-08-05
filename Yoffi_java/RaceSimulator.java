/*The Problem: "Multi-Threaded Race Simulator"
Simulate a race between multiple runners, where each runner is its own thread, and print a live progress bar for each one as they "run."
Requirements
Create a Runner class that implements Runnable.
Each runner has a name and a random speed (e.g., sleeps a random amount between 100–500ms per step).
Each runner "moves" in a loop from 0 to 100 (representing % of race completed).
Print a live-updating progress bar for each runner, something like:
   Alice   [=========-----------] 45%
   Bob     [===============-----] 78%
   Charlie [======---------------] 30%
(Use \r or clear the console lines each update — this is the "wow" visual factor.)
Spawn one Thread per runner and start them all at once with .start().
Use Thread.join() on all threads so your program waits until every runner finishes before declaring a winner.
Track and print the winner — whichever thread reaches 100% first (not just first in your loop — actually detect it as it happens, live).*/
import java.util.Random;

class Runner extends Thread {
    String runnerName;
    double speed;
    int myIndex;

    static int[] progress = new int[3];
    static boolean raceOver = false;
    static String winner = null;
    static Object lock = new Object();

    void setRunnerName(String a) {
        runnerName = a;
    }

    void setSpeed(double b) {
        speed = b;
    }

    void setIndex(int i) {
        myIndex = i;
    }

    public void run() {
        try {
            int myProgress = 0;
            while (myProgress < 100 && !raceOver) {
                Thread.sleep((long) speed);

                myProgress = myProgress + 1;

                synchronized (progress) {
                    progress[myIndex] = myProgress;
                }
                if (myProgress>=100) {
                    synchronized (lock) {
                        if (!raceOver) {
                            raceOver = true;
                            winner = runnerName;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class RaceSimulator {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("----------------------------------------------------------------------------------------------------");
        Random random = new Random();
        Runner Alice = new Runner();
        Alice.setRunnerName("Alice");
        Alice.setSpeed(100 + random.nextInt(400));
        Alice.setIndex(0);

        Runner Bob = new Runner();
        Bob.setRunnerName("Bob");
        Bob.setSpeed(100 + random.nextInt(400));
        Bob.setIndex(1);

        Runner Charlie = new Runner();
        Charlie.setRunnerName("Charlie");
        Charlie.setSpeed(100 + random.nextInt(400));
        Charlie.setIndex(2);

        Alice.start();
        Bob.start();
        Charlie.start();

        while (!Runner.raceOver) {
            printBoard();
            Thread.sleep(150);
        }

        printBoard();
        Alice.join();
        Bob.join();
        Charlie.join();

        System.out.println("\nWINNER: " + Runner.winner + "!");
    }
    static void printBoard() {
        synchronized (Runner.progress) {
            System.out.println("Alice: " + Runner.progress[0]+"%");
            System.out.println("Bob: " + Runner.progress[1]+"%");
            System.out.println("Charlie: " + Runner.progress[2]+"%");
        }
        System.out.println("-------------------------------------");
    }
    
}