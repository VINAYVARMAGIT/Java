class Rectangle{
    int length;
    int breadth;

  Rectangle(int l, int b){
     this.length=l;
     this.breadth=b;
 }
 Rectangle(Rectangle r){
    this.length = r.length;
    this.breadth = r.breadth;

 }
  int area(Rectangle r){
    return r.length*r.breadth;
  }

    int area(){
      return length*breadth;
    }
}


public class Constructors {

    public static void main(String[] args) {
      Rectangle r1 = new Rectangle(5,6);
      Rectangle r2 = new Rectangle(r1);

      int c = new Rectangle(6,7).area(r1);
      //int value = r1.area();
     System.out.println(r1.area());
     System.out.println(r2.area());
     System.out.println(c);
    }

}
