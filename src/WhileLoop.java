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

import java.util.Scanner;

public class ReadSetIntegers
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;
        
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }  
}