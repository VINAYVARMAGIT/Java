// import java.util.Scanner;

// class  RightAngleTriangle{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int row = s.nextInt();
        
//         for (int i = 1; i <= row; i++) {
//             for (int j = 0; j <i; j++) {
//                 System.out.print("*");           
//             }
//             System.out.println("");

            
//         }
//     }

// }

// class Box {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int row = s.nextInt();
        
//         for (int i = 1; i <= row; i++) {
//             for (int j = 0; j <row; j++) {
//                 System.out.print("*");           
//             }
//             System.out.println("");

            
//         }
//     }

// }
// class RightAngleTriangleOtherSide {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int n = s.nextInt();
        
//          for (int i = n; i >=1; i--) {
//             for(int j=1; j<i;j++)
//             System.out.print(" ");
//             for(int j =0; j<=n-i; j++)
//             System.out.print("*");  
//             System.out.println("");          
//          }         
//     }
// }

// class SpaceBox{
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
         
//         int n = s.nextInt();
//         for(int i=1; i<=n; i++){

//             if (i==1 || i==n) {
//                 for(int j =1;j<=n; j++){
//                     System.out.print(j);
//                 }
//                 System.out.println("");
//             }
//             else{
//                 for(int j =1;j<=n;j++){
//                     if (j==1 || j==n) {
//                         System.out.print(j);
//                     }
//                     else System.out.print(" ");
//                     //System.out.println("");
//                 }
//               System.out.println("");
//             }   
//             }
//         }

//     }

//     class NumberTriangular{
//         public static void main(String[] args) {
//             Scanner s = new Scanner(System.in);
//             int n = s.nextInt();

//         }
//     }

// class PrimeNumber1{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         //int n = s.nextInt();
        
//          int a=s.nextInt();
//          int b=s.nextInt();
         
//          for(int j =a; j<=b;j++){
//             if(j==0 || j==1)continue;
//             int count=0;
//         for(int i=2; i<j/2; i++)
//         {
//             if(j%i==0)count++;
//         }
//         if(count ==0)System.out.println(j);
//     }
//     }
// }

import java.util.Scanner;
class Tri{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int row = s.nextInt();
        int m = row;
        for (int i = 0; i < row ; i++) {

            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = m; j <= m+i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

class Rhombus{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = 1;;
         
       
        for (int i = 0; i < n; i++) { 
            
            if ( i<(n/2)+1) {             
            for (int j = 1; j < n-i; j++) {             
                System.out.print(" ");              
            }
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            m =m+2;
        }
        else {         
            for (int j = 1; j <= i-n/2; j++) {             
            System.out.print(" ");              
        }
        for (int j = 0; j <m ; j++) {
            System.out.print("*");
        }
        m = m-2;
    }
            
        
            System.out.println("");

            }
           
    }
}