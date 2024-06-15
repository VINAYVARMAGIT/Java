import java.util.Scanner;

public class UsingMethodRecursion {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean isPrime =m1(n,2);
        
        if (isPrime) {
            System.out.println("It's not a prime number");
        }
        else System.out.println("It's a prime number");

    }

static boolean m1(int n,int i){
    if (n==i) {
        return false;
    }
   if (n==0 || n==1) {
    //System.out.println("It's not a prime number.");
    return true;
   }
  if (n%i == 0)
   {
   // System.out.println("It's not a prime number.");
    return true;
    }
    return m1(n, i+1);  
    }
}


class PalindromeUsingMethods{

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = s.nextInt();
        int rev = reversed(n,0);
        if (n == rev) {
            System.out.println("Its a palindrome number.");     
        }
        else System.out.println("It's not a palindrome number");
    }

    static int reversed(int n,int rev){
        if (n==0) return rev;
        int rem =n%10;
        rev = rev*10 + rem;
        return reversed(n/10,rev);
    }
}

class SumOfNumberToSingleDigit{
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be converted into single digit:");
        int n = s.nextInt();
        System.out.println(added(n,0));
       }

       static int added(int n,int num){
         if (n==0) return num;
         int rem = n%10;
         num = num +rem;
         return added(n/10, num);
       }
}