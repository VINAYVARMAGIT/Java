import java.util.Scanner;

// class Fact{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
      

//         for (int j =0; j<=n;j++) {
//             int fact= 1;
//         for(int i=1;i<=j;i++){
//             if(i==0){ fact=1;
//             break;
//             }
//           fact *=i;
//         }
//         System.out.println("Factorial of the "+j + "number "+ fact);
//     }
//     }
// }

// class AlternateFibonacci{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         int n = s.nextInt();
//         int a = 0;
//         int b = 1;

//         for(int i =0;i<n;i++){

//             System.out.println(a);
//             int next = a+b;
//             a = b;
//             b = next;

//             next= a +b;
//             a=b;
//             b = next;
//         }
//     }
// }

// class GcdOfTwoNumbers{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int first= s.nextInt();
//         int second=s.nextInt();

//         int ran = first>second? first:second;
//         for (int i = 2; i <ran ; i++) {
//         if (first%i==0 && second%i==0) {
//             System.out.println("The GCD of two numbers is: " +i);
//             break;
//         }
//     }
//     }
// }


// class Book {
//     void writing(){
//         System.out.println("Book is used to write data");
//     }
// }

// class Paper extends Book{
//     void paperWrite(){
//         System.out.println("This is a blank page.");
//     }
// }
// class DownCastig{
// public static void main(String[] args) {
    
//     Book b = new Paper();
//     // b.paperWrite();
//     Paper p = (Paper) b;
//     p.paperWrite();
// }
// }

class A{}
class B extends A{}
class C extends B{}
class D extends A{}
class Test{
    public static void main(String[] args) {
        A a = new B();
       System.out.println(a instanceof A);
       System.out.println(a instanceof B);
       System.out.println(a instanceof D);
    }
}