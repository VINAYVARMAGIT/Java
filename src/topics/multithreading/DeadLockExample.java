package topics.multithreading;

class Resource{
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
}
public class DeadLockExample {

    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(
            ()->{
              synchronized (r1) {
                  r1.setCount(10);
                  try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                  synchronized (r2) {
                   System.out.println(r2.getCount());
                }
              }
            }
        );
        Thread t2 = new Thread(
            ()->{
              synchronized (r2) {
                  r2.setCount(10);
                  try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                  synchronized (r1) {
                   System.out.println(r1.getCount());
                }
              }
            }
        );

        t1.start();
        t2.start();

    }
}

class Shop{
    String book;
    public synchronized void setBook(String name,Shop s){
        this.book=name;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        s.getBook();
    }
    public synchronized void getBook(){
        System.out.println(book);
    }
}

class DeadLockAnotherExample{
    public static void main(String[] args) {
        Shop s1 = new Shop();
        Shop s2 = new Shop();

        Thread t1 = new Thread(()->{
            s1.setBook("maths",s2);
        });
        Thread t2 = new Thread(()->{
            s2.setBook("maths",s1);
        });

        t1.start();
        t2.start();
    }
}
