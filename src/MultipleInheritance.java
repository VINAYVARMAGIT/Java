class First{

    int  m = 5;
}

class Second extends First{

    int n =10;

    @Override
    public String toString() {
        return "Second [m=" + m + ", n=" + n + "]";
    }

    
    
    
}
class Third extends First{


    int o = 15;

    @Override
    public String toString() {
        return "Third [m=" + m + ", o=" + o + ", getClass()=" + getClass() + "]";
    }
    
}

public class MultipleInheritance {

    public static void main(String[] args) {
        
 
        First s = new Second();

        First t = new Third();
        System.out.println(t);
        System.out.println(s);
    }

}
