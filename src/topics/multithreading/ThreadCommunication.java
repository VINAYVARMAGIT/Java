package topics.multithreading;


class SharedResource{
    int data;
   boolean hasData=false;


   public synchronized void produce(int data){
    while (hasData) {
        try {
            wait();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }  
    this.data=data;
    hasData=true;
    System.out.println("produced " +data);
    notify();
   }
   public synchronized int consume(int i){
    while (!hasData) {
        try {
            wait();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }  
    hasData=false;
    System.out.println("consume "+i);
    notify();
    return data;
   }
}

class Produce implements Runnable{
    SharedResource resource;
    Produce(SharedResource resource){
        this.resource=resource;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
           
            resource.produce(i);
           
        }
    }
}
class Consume implements Runnable{
    SharedResource resource;
    Consume(SharedResource resource){
        this.resource=resource;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            resource.consume(i);
        }
    }
}
public class ThreadCommunication {

    public static void main(String[] args) {
        SharedResource s= new SharedResource();
        Thread t1 = new Thread(new Produce(s));
        Thread t2 = new Thread(new Consume(s));
        t1.start();
        t2.start();
    }
}
