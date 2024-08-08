public class Lambda {
public static void main(String[] args) {
    Runnable r1 = ()->{
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    Runnable r2 = ()->{
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    };

    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);

    t1.start();
    t2.start();
}
}
