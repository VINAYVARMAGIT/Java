import java.util.Scanner;

public class Vinay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();

        if (n%2!=0) {
        for (int i = 0; i < (n/2)+1; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j ||i+j==n-1) {
                    System.out.print("*");               
                }
                else System.out.print(" "); 
               // System.out.println("");              
            }     
            System.out.println("");         
        }        
        }
        else {
            for (int i = 0; i < n/2; i++) {
    
                for (int j = 0; j < n; j++) {
                    if (i==j ||i+j==n-1) {
                        System.out.print("*");               
                    }
                    else System.out.print(" ");               
                }    
                System.out.println("");             
            }       
            }
    }
}
