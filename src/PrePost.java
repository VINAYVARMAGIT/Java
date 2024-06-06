import java.util.Scanner;

public class PrePost {

    public static void main(String[] args) {
        
    
    
    //     int n = 5;
    //     //n = n++;
        

    // System.out.println(n++);
    // System.out.println(n);
   
    // System.out.println(n++);
    // System.out.println(n);
    
    // System.out.println(n++);
    // System.out.println(n);

    int a=0;

    int b = ++a + a++;
    int c = b + a;
    System.out.println(a);
    System.out.println(c);
    
    Scanner s = new Scanner(System.in);
    String n = s.nextLine();

   System.out.println(n);

    }

}
