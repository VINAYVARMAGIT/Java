// Finding  lcm of 2 numbers

import java.util.Scanner;

public class LCM {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the bigger number:");
        int n1 = s.nextInt();
        System.out.println("Enter the smaller number:");
        int n2 = s.nextInt();
        //int i= 1;
        for (int i=1; i<=n2;i++){

            while(n1%n2 != 0){
                n1 *= i;
                break;
            }
        }
           
        
        System.out.println("The LCM of two numbers are:" +n1);
    } 
    
}
