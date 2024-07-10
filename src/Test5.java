import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int n = s.nextInt();
        int sq = n*n;

        String checked = Test5.checkNeon(sq, n);
        System.out.println(checked);

        
    }
    static String checkNeon(int sq,int n){
        int res=0;
        while(sq>0){
          res += sq%10;
          sq /=10;
        }
        if(res == n) return "This is a neon Number";
         else return "It's not a neon number";

    }
}

class ArmstrongNumber5{
    public static void main(String[] args) {
     Scanner s = new Scanner (System.in);
    // System.out.println("Enter the number to check if it's a armstrong number:");
    //  int n = s.nextInt();
    System.out.println("Enter the starting range: ");
    int start = s.nextInt();
    System.out.println("Enter the number until: ");
    int end = s.nextInt();

     for (int i = start; i <end ; i++) {
        
     int armstrongNumber = ArmstrongNumber5.checkArmStrong(i);
    // System.out.println(armstrongNumber);

     if(i == armstrongNumber) System.out.println( i +" is a armstrong number.");
    // else System.out.println("It's not a armstrong numberr");
    }
    }


    static int checkArmStrong(int n){

        int realn = n;
        int power = 0;
        while(n>0){
            n/=10;
power++;
        }

       
        int after = 0;
        while(realn>0){
            int num = 0;
            num = realn%10;
            int temp=1;
            for (int i = 0; i < power; i++) {
                temp *=num;
            }
            realn /=10;
            after +=temp;
        }
return after;
    }
}

