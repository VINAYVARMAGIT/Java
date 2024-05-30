import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
          System.out.println("Enter the number:");
          
        int n = s.nextInt();
        System.out.print("The factors of "+ n + " is: ");
        
        for (int i = 1; i <= n; i++) {

            if (n%i ==0) {
                System.out.print(i+",");
                
                
            }
            
        }
                
    }

}
