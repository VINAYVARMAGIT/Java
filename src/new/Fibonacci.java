import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        
         Scanner s = new Scanner(System.in);
System.out.print("Until this number:");
        int n = s.nextInt();
        
        int firstNum = 0;
        int secondNum =1;

        for (int i = 1; i <= n; i++) {

            System.out.println(firstNum);
            
            
        
       int  newNum = firstNum +secondNum;
       firstNum=secondNum;
       secondNum= newNum;
        }
       
    }

}
