class A{
    static{
        System.out.println("static of a");
    }
    {
        System.out.println("Non Static of a");
    }
    A(){
        System.out.println("Constructor of A");
    }
}
class B extends A{
    static{
        System.out.println("static of b");
    }
    {
        System.out.println("Non Static of b");
    }
    B(){
        System.out.println("Constructor of B");
    }
}
class C extends B{
    static{
        System.out.println("static of c");
    }
    {
        System.out.println("Non Static of c");
    }
    C(){
        System.out.println("Constructor of c");
    }
}


class SuperKeyword {

    public static void main(String[] args) {
        new C();
        
    }

}
