import java.util.Scanner;

public class MobileApp {

    private String name;
    private int price ;
    private String brand;
    
    @Override
    public String toString() {
        return "MobileApp [name=" + name + ", price=" + price + ", brand=" + brand + "]";
    }
    public MobileApp(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    
}


class Test41{
    public static void main(String[] args) {
        MobileApp m1 = new MobileApp("nord", 30000, "oneplus");
       // System.out.println(m1);
      Scanner s = new Scanner(System.in);

        boolean exit = true;
        do { 
            System.out.println("1.To print all the values of the mobileInsert values \n2.Change brand \n3.exit");     
            int n =s.nextInt();
            
            switch (n) {
                case 1:       
                    System.out.println(m1);

                    break;
                    case 2:
System.out.println("Enter the brand you want to change:");
                    String brandChange = s.next();
                    m1.setBrand(brandChange);
                    m1.setBrand(brandChange);
                    System.out.println("it is changed to " +m1.getBrand());
                    break;
                    case 3:
                    exit = false;
                    break;
                default: System.out.println("Enter a valid number");
                    break;
            }

        } while (exit);
    }
}