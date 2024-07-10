/**
 * Engine
 */
public interface Engine {

    
} Engine {
    abstract void motor();
    void parts();
}

class Car5 extends Engine {

    public void motor(){
   System.out.println("M8");
    }

    @Override
    public void parts() {
       System.out.println("Its has 5 parts.");
    }
}
class Bike extends Engine {

    @Override
    public void motor() {
        System.out.println("M5");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'motor'");
    }

    @Override
    public void parts() {
        System.out.println("It has 10 parts.");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'parts'");
    }
    

    class Test10{
        public static void main(String[] args) {
            Bike b1 = new Bike();
            Car5 c1 = new Car5();

            b1.parts();
            //c1.motor();
        }
    }
}
