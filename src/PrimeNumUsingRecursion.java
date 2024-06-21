import java.util.Scanner;

public class PrimeNumUsingRecursion {
   public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number to check if it's a prime a number:");
    int n =s.nextInt();
    boolean PrimeNumber= checkingPrimeNumber(n,2);
   

    if (PrimeNumber)System.out.println("It's not a prime number."); 
    else System.out.println("It's a prime numner.");


   }

   static boolean checkingPrimeNumber(int n,int i){
    if(n%i!=0 && n/2==i) return false;
      if(n<=1) return true;
      if(n%i==0) return true; 
      
    return checkingPrimeNumber(n, ++i);
   }

}
