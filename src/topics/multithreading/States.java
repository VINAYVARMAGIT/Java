package topics.multithreading;

class Counter  implements  Runnable{
    int number;

    @Override
    public void run(){
        for (int i = 0; i<10 ; i++) {
            number++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}



public class States {
  public static void main(String[] args) {
    Counter  c =new Counter();
    Thread t1 = new  Thread(c);

    t1.start();
    System.out.println(Thread.currentThread().getState());
   try {
    t1.join();
   } catch (Exception e) {
    
   }
  }
}
class SharedResource {
    synchronized void accessResource() {
        try {
            Thread.sleep(5000); // Simulating long execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BlockedStateDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.accessResource());
        t1.start();

        try {
            Thread.sleep(1000); // Ensure t1 locks the resource first
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread mainThread = Thread.currentThread();
        Thread t2 = new Thread(() -> {
            while (true) {
                System.out.println("Main thread state: " + mainThread.getState());
                if (mainThread.getState() == Thread.State.TERMINATED) {
                    break;
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t2.start();

        synchronized (resource) { // Main thread tries to acquire the lock
            System.out.println("Main thread acquired lock!");
        }
    }
}


