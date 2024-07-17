public class SingleTonClass {
    
    int count;
    private static SingleTonClass instance;

    private SingleTonClass(){}

    public static SingleTonClass getInstance(){
        if(instance==null){
        instance= new SingleTonClass();
        }
        return instance;
    }
    public void add(){
        count++;
        System.out.println(count);
    }
}
class Test20{
    public static void main(String[] args) {
        SingleTonClass s2 = SingleTonClass.getInstance();
        SingleTonClass s3 = SingleTonClass.getInstance();

        System.out.println(s2 == s3);
        s2.add();
        s3.add();
    }
}