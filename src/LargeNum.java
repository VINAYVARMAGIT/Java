import java.util.Scanner;

public class LargeNum {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int biggestNum = a>b ? (a>c ? a:c) : (b>c ? b:c );

        System.out.println("The second biggest number is :" +secondBig(a,b,c));
        System.out.println("The biggest among the given 3 numbers is " + biggestNum);

    }
        public static int secondBig(int a, int b, int c){

        if(a>b && b>c) return b;
        else if(b>a && a>c) return a;
        else if(a>c && c>b) return c;
        else if(a<b && b<c) return b;
        else if(b<a && a<c) return a;
        else return c;
        }     

       
        //System.out.println("The second biggest number is "+ secondBiggestNum);
    }

