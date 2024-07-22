// import java.util.Scanner;
// public class ToUpperCase {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the String to be converted to upperCase: ");
//         String name = s.nextLine();
//         String upperCaseString = converter(name);
//         System.out.println("The converted value is: "+upperCaseString);
//     }
//     public static String converter(String name){
//         char []ch = name.toCharArray();
//         String n1 ="";
//         for (int i = 0; i < ch.length; i++) {
//         char ch1 = ch[i];
//         if (ch1 >='a'&& ch1<='z') {
//             ch1 = (char) (ch1- 32) ;
//         }
//          n1+=ch1;  
//     }
//         return n1;
// }
// }

import java.util.Scanner;
 class ToLowerCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String to be converted to lowerCase: ");
        String name = s.nextLine();
        String lowerCaseString = converter(name);
        System.out.println("The converted value is: "+lowerCaseString);
    }
    public static String converter(String name){
        char []ch = name.toCharArray();
        String n1 ="";
        for (int i = 0; i < ch.length; i++) {
        char ch1 = ch[i];
        if (ch1 >='A'&& ch1<='Z') {
            ch1 = (char) (ch1+ 32) ;
        }
         n1+=ch1;  
    }
        return n1;
}
}
