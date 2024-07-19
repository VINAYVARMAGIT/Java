public class Exceptions {
    public static void main(String[] args) {
        
        try {
            System.out.println(30/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("It's finally done");
        }
    }
}

class Throws{
    public static  void calculating()  throws ArithmeticException{
        int res = 30/0;

        System.out.println(res);
    }
    public static void main(String[] args) {
        
        try {
            calculating();
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
}

class Throw{

    public static void clean(){

        throw new ArithmeticException();
    }

    public static void main(String[] args) {
        clean();
    }
}

class StringCls{
    public static void main(String[] args) {
        // String name = "vinay";
        // String n = "vinay";


        // System.out.println(name.hashCode());
        // System.out.println(n.hashCode());
        // System.out.println(name == n);

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("vinay");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
    }
}