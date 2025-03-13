/**
 * Engine
 */
abstract  class Engine {
    abstract void motor();
   
}

class Car5 extends Engine {

    public void motor(){
   System.out.println("M8");
    }

   
}
class Bike extends Engine {

    @Override
    public void motor() {
        System.out.println("M5");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'motor'");
    }

   
    

    class Test10{
        public static void main(String[] args) {
            Bike b1 = new Bike();
            Car5 c1 = new Car5();

            
            //c1.motor();
        }
    }
}
