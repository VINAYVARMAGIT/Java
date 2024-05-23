public class Nsvariables {


    int num = 10;

    public void type (int n){
       num = n;

    }

    public void Display(){

        System.out.println(num);
        
    }
    public static void main(String[] args) {
        
        Nsvariables n1 = new Nsvariables();
        //System.out.println(num);
    
        n1.type(5);
        n1.Display();
    }

}
