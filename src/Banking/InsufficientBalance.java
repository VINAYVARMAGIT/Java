package banking;

public class InsufficientBalance  extends Exception{

    InsufficientBalance(String name){
        super(name);
    }
}
