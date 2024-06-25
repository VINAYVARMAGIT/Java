class Rectangle{
    int length;
    int breadth;

  Rectangle(int l, int b){
     this.length=l;
     this.breadth=b;
 }

    int area(){
      return length*breadth;
    }
}


public class Constructors {

    public static void main(String[] args) {
      Rectangle r1 = new Rectangle(5,6);
      //int value = r1.area();
     System.out.println(r1.area());
    }

}
