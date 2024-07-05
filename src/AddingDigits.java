//adding the digits of a number until it becomes single digit 

import java.util.Scanner;

public class AddingDigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        


        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int r,sum=0;
        while (num>0) {
            r = num%10;
           sum += r;        
          num /=10;  
          if(num==0 && sum>9) 
          {
            num = sum;
            sum =0;
          }     
        }
        System.out.println(sum);
        System.out.println(sum +" is the sum of the digits of the numbers.");
    }
}
