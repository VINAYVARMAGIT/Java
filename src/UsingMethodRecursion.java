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
         return added(n/10, num+rem);
       }
}

class ArmstrongNumberUsingMethods{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number to check it:");
        int n = s.nextInt();
        int numberPower = numberPower(n, 0);
        //System.out.println(numberPower);
        double number = number(n, numberPower, 0);

        if (number == n) System.out.println("It's a armstrong number.");
        else System.out.println("It's not a armstrong number.");

    }

    static double number(int n,int numberPower,double num){
        if(n==0) return num;
      int rem = n%10;
      num = num +Math.pow(rem, numberPower);
      return number(n/10, numberPower, num);
    }

static int numberPower(int n,int count){
    if (n==0) return count;
  return numberPower(n/10, count+1);
}   
}


class FibannocciSeries{
    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = s.nextInt();
        System.out.println("The fibannocci series value of "+ n+ "number's is " + loop(n, 0, 0, 1) );

    }
    static int loop(int n,int num,int a,int b){

        if(n==0) return b; 
        num = a+b;
         a=b;
         b=num; 
     return loop(--n, num, a, b);
    }

}


// 0 1 1 2 3 5 8 13 