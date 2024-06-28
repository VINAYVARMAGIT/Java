class StaticExample {
    static int staticVar;

    static {
        // Static block to initialize staticVar
        staticVar = 10;
        System.out.println("Static block executed. staticVar = " + staticVar);
        System.out.println("It's the block.");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed. staticVar = " + staticVar);
    }
}


class V{
   
    V(){
        System.out.println("This is a constructor");
    }
    {
        System.out.println("This is non-static method");
    }
    static{
        System.out.println("This is static method");
    }
}

class Run{
    public static void main(String[] args) {
        new V();
    }
}