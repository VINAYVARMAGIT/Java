class Car{
    String name;
    int num;
    String Brand;

}

class ForCar{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.name= "Maruthi";
        Car c2=c1;
        c2.name= c1.name+"Suzuki";

        System.out.println(c2.name);
    }
}