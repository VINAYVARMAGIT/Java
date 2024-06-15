import java.util.Scanner;

class Methods {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n <=1) {
            System.out.println("It's not a prime number.");
        return;
        }
        for (int i = 2; i <=n/2; i++) {
            if (n%i==0) {
                System.out.println("It's not a prime number.");
                return;
            }

    }
     System.out.println("It's a prime number.");
}

    }

class A{
    public static void main(String[] args) {
        m1(5);

        m1(5+7+2);

        m1('a'); //auto widening
        m2();
       // m1(34.24); compile type error
    }

    static void m1 (int a){
     System.out.println("a="+ a);
    }

    static int m2(){
        {
            if (true) {
                //return 5;
            }
            //return 7;
            //System.out.println("This line may not execute.");
            return 7;
        }
    }
}

class B{
    public static void main(String[] args) {
       int a =3;
       m1(a);
       System.out.println(a);
    }

    static void m1(int a){
        a *=3;
        System.out.println(a);
    }
}
class C{
    public static void main(String[] args) {
        int i=0; //1 2  3
        int j=0;//9
             //  2      2        4
        j = m1(++i)+m1(i++)+m1(++i);
        System.out.println(i);
        System.out.println(j);
    }
  static int m1(int a)
  {
    return ++a;
  }
}

class D{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the start num:");
        int i = s.nextInt();
        System.out.println("Enter the ending num:");
        int n = s.nextInt();
        System.out.println(m1(i,n));       
    }
    static int m1(int i,int n){
        if(n <i) return 1;
         return n*m1(i,n-1);
        }
}


class E{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = s.nextInt();
        System.out.println(m1(n));
        m1(n);        
    }
    static int m1(int i){
        if(i ==0) return 0;
         return i+m1(i-1);
        }
}

class F{
    public static void main(String[] args) {

        int i=2;
        m1(i);
    }

    static void m1(int i){
        if (i>=3)return;
        System.out.println(i);
        m1(++i);
        m1(++i);
        System.out.println(i);
    }
}

