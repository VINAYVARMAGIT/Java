class Car{


    String name ;

    void createName(){

        name = "Toyota";
        System.out.println(name);
    }
}
class Benz extends Car{
@Override
    void createName(){
        super.createName();
        name= "Benz";
        System.out.println(name);
    }
}


public class MethodOver {


    public static void main(String[] args) {
        Benz b = new Benz();
        b.createName();
    }
}
