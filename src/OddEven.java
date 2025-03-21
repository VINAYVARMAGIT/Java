public class OddEven {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            System.out.println("These are even numbers.");
            for (int i = 0; i < 10; i++) {
                if (i%2==0) {
                    System.out.println(i);
                }
            }
        });
        Thread t2 = new Thread(()->{
            System.out.println("These are odd numbers.");
            for (int i = 0; i < 10; i++) {
                if (i%2!=0) {
                    System.out.println(i);
                }
            }
        });

        t1.start();
        t1.join();
        t2.start();
    }
}
class FindMissing{
    public static void main(String[] args) {
        int [] i = {5,9,0,1,2,-2};
        int highest = i[0];
        for (int j = 0; j < i.length; j++) {
            if (i[j]>highest) {
                highest=i[j];
            }
        }
        for (int j = 1; j < highest; j++) {
            boolean flag =  false;
            for (int j2 = 0; j2 < i.length; j2++) {
                if (j==i[j2]) {
                    flag=true;
                }
            }
            if (!flag) {
                System.out.println("The first positive number is:"+j);
                break;
            }
        }
    }
}