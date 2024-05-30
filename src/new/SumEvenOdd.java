import java.util.Scanner;



public class SumEvenOdd {

    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
      
    int n = s.nextInt();
        int SumEven = 0;
        int SumOdd = 0;
        for(int i=0; i<=n; i++){

            if (i%2==0) 
            {
                SumEven += i;
            }
            else 
            {
                SumOdd += i;
            }
           
            
        }
        System.out.println("The sum of even numbers for the given number="+ SumEven);
        System.out.println("The sum of Odd numbers for the given number="+ SumOdd);
    }

}
