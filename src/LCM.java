// Finding  lcm of 2 numbers

import java.util.Scanner;

// public class LCM {


//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the bigger number:");
//         int n2 = s.nextInt();
//         System.out.println("Enter the smaller number:");
//         int n1 = s.nextInt();
//         for (int i = 1; i <= n1; i++) {  
//         while (n2>n1) {
//             if (n2%n1 == 0)  {
//                 System.out.println(n2);
//                 break;
//             }     n2*=i;    
//                  }
//       }  
//     }    
// }

class Llcm{
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int a = s.nextInt();
    int b = s.nextInt();

    int big = a>b?a:b;
int anoBig = big;
     
    for(int i =1;i<=a;i++){
    if (big%a==0 && big%b==0) {
        System.out.println(big);
        break;
    }
        big = i*anoBig;
}
   }
}
