import java.util.Arrays;
import java.util.Scanner;

// public class ReplaceRepeatedLetters {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String n = s.nextLine();
//         String str = "";

//         char[] ch = n.toCharArray();

//         for (int i = 0; i < ch.length; i++) {
//             char ch1 = ch[i];
//             boolean b = false;
//             char count= 49;
//             for (int j = i + 1; j < ch.length; j++) {
//                 if (ch1 == ch[j]) {
//                     ch[j] = ++count;
//                     b = true;
//                 }
//             }
//             if (b) {
//                 ch[i] = '1';
//             }
//         }
//         System.out.println(ch);
//         // for (char c : ch) {
//         //     if ( c !='\u0000')
//         //         str += c;
//         // }
//         // System.out.println(str);
//     }
// }

class PalindromSubString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name you wan to print the substring and palindrome of it: ");
        String name = s.nextLine();
        String small =name;
        for (int i = 0; i < name.length(); i++) {
            for (int j = i+3; j <= name.length(); j++) {
                String charac = name.substring(i, j);
                if (isPalindrome(charac)) {
                    if(charac.length()<small.length()){
                        small = charac;
                    }
                }
            }
        }
        System.out.println(small);
    }
        public static boolean isPalindrome(String n){
           char [] ch = n.toCharArray();
           int i =0;
           int j=ch.length-1;
           while(i<j){
            if (ch[i]!=ch[j]) {
                return false;
            }
           i++;
           j--;
        }
        return true;
        }
}

class Replaced{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char [] ch =name.toCharArray();
        // String newname="";
        for (int i = 0; i < ch.length; i++) {
            boolean changed = false;
            int count = 49;
         for (int j = i+1; j < ch.length; j++) {
            if (ch[i]==ch[j]) {
                ++count;
                ch[j]= (char)count;
                changed = true;
             }
         }   
         if(changed) ch[i]='1';
    }
    System.out.println(ch);
}
}

class Remove{
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String line = s.nextLine();
        String [] str = line.split(" ");
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if(str[i].equals(str[j]))
                {
                 str[j]="";
                }
            }
        }
          System.out.println(Arrays.toString(str));
    //    for (String string : str) {
    //     System.out.print(string );
    //    }
    }
}

class WrapperClass{
    public static void main(String[] args) {
        String s ="8219";
        int n = Integer.parseInt(s);
        System.out.println(n);
        Integer num = Integer.parseInt(s);
        System.out.println(num);
    }
}

class Carry implements Cloneable{
    int num ;
    String name;
    Carry(int num,String name){
        this.num = num;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Carry [num=" + num + ", name=" + name + "]";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
   
}
class Main1{
    public static void main(String[] args) throws CloneNotSupportedException {
        Carry c = new Carry(5, "Vinay");
        System.out.println(c);
        Carry c1 = (Carry)c.clone();
        System.out.println(c1);
        c1.name= "varma";
        System.out.println(c1);
        System.out.println(c);
    }
}
class BigLine{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String of lineu want to print without duplicate: ");
        String line =s.nextLine();
 
        String [] str = line.split(" ");
       for (int i = 0; i < str.length; i++) {
          if(str[i]== null) continue;
            for (int j = i+1; j < str.length; j++) {
                  if (str[j]==null) continue;      
                  if (isSame(str[i],str[j])) {
                    str[j] = null;
                  }
                }       
             }
             for (String string : str) {
                if (string == null) continue;
                System.out.print(string+" ");
             }
            }
            public static boolean isSame(String s1,String s2){
                   if(s1.length()!= s2.length())  return false;
                    char [] s3 = s1.toCharArray();
                    char [] s4 = s2.toCharArray();
                 for (int i = 0; i < s1.length(); i++) {
                    if (s3[i] != s4[i]) {
                        return false;
                    }
                   }
                   return true;
            }
            
    }
    class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getId() + " Value " + i);
                try {
                    Thread.sleep(1000); // Pause for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public class ThreadExample {
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();
            t1.start();
            t2.start();
        }
    }

    class Checking extends Thread{
        @Override
        public void run(){
         m1();
        }
        public static void m1(){
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        }
    }

    class CheckingThread {
        public static void main(String[] args) {
            Checking c = new Checking();
            c.start();
            for (char i = 'a'; i < 'd'; i++) {
                System.out.println(i);
            }
        }
    }

    class SecondMin{
        public static void main(String[] args) {
            String s = "vinayvarma";
            String str ="";
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                int count = 1;
                char ch1 = ch[i];
                for (int j = i+1; j < ch.length; j++) {
                    if (ch1==ch[j]) {
                        count++;
                        ch[j]='\u0000';
                    }
                }
                if (ch[i]!='\u0000') {
                    str +=ch[i];
                }
                System.out.println(ch1 + ":" +count);
            }
            System.out.println(str);
        }
    }
    class AscendingOrder{
        public static void main(String[] args) {
            String s = "vinay";
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                for (int j = 0; ch.length-1>i; j--) {
                    if (ch[i] >ch[j]) {
                      ch[i]=ch[j];  
                    }else continue;
                }
            }
            for (char c : ch) {
                System.out.print(c);
            }
        }
    }