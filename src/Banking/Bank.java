package Banking;

public class Bank {

    int bal;
    Bank(int bal){
       this.bal=bal;
    }
    void withdrawAmount(int amount) throws InsufficientBalance{
        if(amount>bal){
            throw new InsufficientBalance("The amount enetered is not present");
        }
        bal -=amount;
    }

    int getBal(){
        return bal;
    }
}
