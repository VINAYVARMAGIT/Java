// import java.util.Scanner;
// class Reverse_Numbers
// {
// 	public static void main(String[] args)
// 	{
// 		Scanner input = new Scanner(System.in);
// 		System.out.print("Enter The Starting Number : ");
// 		int s =input.nextInt();
// 		System.out.print("Enter The Ending Number : ");
// 		int e =input.nextInt(); 
// 		while(s>=e)
// 		{
// 			System.out.println(e);
// 			e++;
// 		}
// 	}
// }

// import java.util.Scanner;

// class AlphabetsReverse
// {
//     public static void main(String[] args) {
        
//         Scanner s = new Scanner(System.in);

//         System.out.println("Enter the starting letter:");
        

//         char c = s.next().charAt(0);

// while (c>='a'){

//     System.out.print(c +" ");

//     c--;
    
// }
//     }
// }

// import java.util.Scanner;

// class Power
// {
//     public static void main(String[] args) {
        
//         Scanner s = new Scanner(System.in);

//          System.out.println("Enter the number:");     
//         int num = s.nextInt();

//         System.out.println("Power of the number:");       
//         int power = s.nextInt();
        
//         int result =1;
//         int i = 0;
//         while (i<power) {

//           result *= num;
//             i++;
//            // continue;
//         }
         

//          System.out.println(result);


        
//    }
// }

// import java.util.Scanner;

// class ReverseNumber
// {
//     public static void main(String[] args)
//     {
//         Scanner s = new Scanner(System.in);
       
//         int reverse = 0;
        
//         System.out.print("Enter the number ");
//         int number = s.nextInt();// 541
        
//         int temp = number;  //541
//         int remainder = 0;
        
//         while(temp>0)
//         {
// 	    remainder = temp % 10; //1 4 5
// 	    reverse = reverse * 10 + remainder; // 1 14 145
//             temp /= 10; //54 5 0
//         }

//         System.out.println("Reverse of " + number + " is " + reverse);
//     }
// }

// import java.util.Scanner;
 
// class WhileLoop
// {
//     public static void main(String[] args)
//     {
//         Scanner console = new Scanner(System.in);
     
//         int number;
//         char choice;
//         int evenSum = 0;
//         int oddSum = 0;
        
//         do
//         {
//             System.out.print("Enter the number ");
//             number = console.nextInt();
        
//             if( number % 2 == 0)
//             {
//                 evenSum += number;
//             }
//             else
//             {
//                 oddSum += number;
//             }
        
//             System.out.print("Do you want to continue y/n? ");
//             choice = console.next().charAt(0);
            
//         }while(choice=='y' || choice == 'Y');
        
//         System.out.println("Sum of even numbers: " + evenSum);
//         System.out.println("Sum of odd numbers: " + oddSum);
//     }  
// }

// import java.util.Scanner;

// class Palindrome {

//     public static void main(String[] args) {
//       Scanner s = new Scanner(System.in);
//       System.out.print("Enter the number:");
//       int num = s.nextInt();
//       int dig=num;
//       int rem =0,pal = 0,addNum =0,mulNum=1;

//       while(num !=0){

//         rem = num%10;
//         addNum += rem;
//         mulNum *= rem;
//         pal= pal*10+ rem;
//         num /=10;
         
//     }
//     System.out.println(addNum);
//     System.out.println(mulNum);
//     if (dig ==pal && addNum ==mulNum)System.out.println("pal");
//      else if ( addNum ==mulNum)System.out.println("Not palindrome but a spy num.");
//     else System.out.println("not pal");

// }
// }

// import java.util.Scanner;

// class Neon{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int num = s.nextInt();
//         int rem =0,sum=0;
//         int sq= num*num;
//         int oriNum = num;
//         while(sq!=0){
            
//             rem = sq%10;
//             sum += rem;
//             sq /=10;
//         }
//         if(num==sum) System.out.println("It's a neon num");
//         else System.out.println("It's not a neon num.");
//     }
// }

import java.util.Scanner;

class PrimeNumbers{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i =1;i<n; i++ ){
            if           


        }
    }
}