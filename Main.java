class Thread5 extends Thread{

    public synchronized void run (){
        for (int i = 0; i < 5; i++) {
            try{
            Thread.sleep(1000);
            }
            catch(Exception e ){
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
    public static synchronized void ch() {
        for (int i = 0; i < 2; i++) {
            System.out.println("vin"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class Main{

     public static void main(String[] args) {
        Thread5 t1 = new Thread5();
        Thread5.ch();
        Thread5.ch();

     }
}