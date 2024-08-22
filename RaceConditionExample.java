public class RaceConditionExample {
    private int counter = 0;

    public synchronized void increment() {
        counter++;  // Increment the counter by 1
    }

    public static void main(String[] args) {
        RaceConditionExample example = new RaceConditionExample();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // The expected value of counter is 2000, but due to race condition, it may be less
        System.out.println("Counter value: " + example.counter);
    }
}
