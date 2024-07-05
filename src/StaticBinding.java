class Shapes{

    int a ;
    int b;
    
  public Shapes(int a, int b) {
        this.a = a;
        this.b = b;
    }
@Override
    public String toString() {
        return "Shapes [a=" + a + ", b=" + b + "]";
    }
void area(){
   System.out.println("There's no area");
  }
  static void size(){
     System.out.println("Shape doesn't have any size.");
  }
}
 
class Square extends Shapes{
    public Square(int a, int b) {
        super(a, b);
        //TODO Auto-generated constructor stub
    }
    void area(){
        System.out.println("4A");
    }
static void size(){
    System.out.println("Square size is 4");
}
}

class Rectangle extends Shapes{
    public Rectangle(int a, int b) {
        super(a, b);
        //TODO Auto-generated constructor stub
    }
    void area(){
        System.out.println("2B 2H");
    }
static void size(){
    System.out.println("Square size is 16");
}
}


class StaticBinding {
    public static void main(String[] args) {
        Shapes s = new Shapes(5,6);
        System.out.println(s);

        s.size();
        s.area();
    }

}
