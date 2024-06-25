import java.util.Scanner;

public class PrimeNumUsingRecursion {
   public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number to check if it's a prime a number:");
    int n =s.nextInt();
    boolean PrimeNumber= checkingPrimeNumber(n,2);
   

    if (PrimeNumber)System.out.println("It's not a prime number."); 
    else System.out.println("It's a prime numner.");


   }

   static boolean checkingPrimeNumber(int n,int i){
    if(n%i!=0 && n/2==i) return false;
      if(n<=1) return true;
      if(n%i==0) return true; 
      
    return checkingPrimeNumber(n, ++i);
   }

}
 class MyClass {
  private int instanceVariable = 10;
  private static int staticVariable = 20;

  public static void staticMethod() {
      // This will cause a compilation error
      // System.out.println(instanceVariable);

      // This is fine
      System.out.println(staticVariable);
  }

  public void instanceMethod() {
      // This is fine
      System.out.println(instanceVariable);

      // This is also fine
      System.out.println(staticVariable);
  }

  public static void main(String[] args) {
      // Calling static method without creating an instance
      MyClass.staticMethod();

      // Creating an instance and calling instance method
      MyClass myObject = new MyClass();
      //myObject.staticMethod();

      myObject.instanceMethod();
  }
}

class Rectangle{
  int length;
  int breadth;

 Rectangle (int length,int breadth){
   this.length = length;
   this.breadth = breadth;
  }
  long area(){
    return length*breadth; 
  }

}
class DisplayRectangle{
  public static void main(String[] args) {
  Rectangle r1 =new Rectangle(10,20);
  System.out.println(r1.area());
  }
}