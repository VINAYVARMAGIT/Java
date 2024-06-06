// // square of this number ending digits 
// //should be equal to the given digit
// import java.util.Scanner;

// class Automorphic{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//        System.out.println("Enter the starting number:");
//        int a = s.nextInt();
//        System.out.println("Enter the ending number");
//        int b = s.nextInt();
//        System.out.println("");
//         for (int j = a; j <b ; j++) {
//              int m =j; 
//             int  sq = m*m;              
//             int temp= m;
//             int count = 0;
//           while (temp>0) {
//           count++;
//           temp /=10;          
//         }
//         int div=1;
//          for(int i =0;i<count;i++){
//          div *=10;
//          }        
//         if ( m == sq%div) {
//             System.out.print(m+" " );
//         }     
//     }
// }
// }

// import java.util.Scanner;

// class PrimeNumbers{
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
//         System.out.println("Enter the starting number:");
//         int a = s.nextInt();
//         System.out.println("Enter the ending number:");
//         int b = s.nextInt();

//         for (int i=a; i <= b; i++) {
//             if( i == 1) continue;
//             boolean isPrime = true;
//         for (int j = 2; j <=i/2; j++) {
//                 if (i%j == 0){
//                     isPrime = false;
//                 }                 
//             }
//             if (isPrime){
//             System.out.println(i);
//             }
//         }
//     }
// 

// import java.util.Scanner;

// class LcmForTwoNum{
//     public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//         int a = s.nextInt();
//         int b = s.nextInt();
//     //   int i = 1;
//     //      while(true){
//     //         if(i%a==0 && i%b==0){
//     //         System.out.println(i);
//     //     break;
//     //          }
//     //     i++;
//     //   }      
    
//     for (int i = 1; i >0; i++) {

//         if (i%a ==0 && i%b ==0) {
//             System.out.println(i);
//             break;
//         }
        
//     }
//     }
// }

import java.util.Scanner;

class PerfectNumbers{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int a = s.nextInt();
        System.out.println("Enter the ending number:");
        int b = s.nextInt();
        for(int j=a; j<b; j++){
        int n1 = 0;
        for (int i=1;i<j;i++){
            if(j%i==0) 
             n1+=i;
        }
        if (n1 == j)System.out.println(j);     
    }
    }
}