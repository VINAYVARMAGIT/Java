import java.util.Scanner;

class Student{
    String name ;
    int id;
    int marks;
    static String institute;

    static void displayName(){

        System.out.println(institute);
        //System.out.println(id);

    }
    void showName(int id,String name){
         
        this.id =id;
        this.name = name;

         System.out.println("Name if the student is "+name+" and the id is "+id);
         System.out.println("Studying in "+institute);
        // System.out.println(marks);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Student s1 = new Student();
        institute= "Siddarth institute of technology";
        //displayName();
        s1.showName(s.nextInt(),s.nextLine());
        //s.nextLine();
        Student s2 = new Student();
        s2.showName(s.nextInt(),s.nextLine());
    }

}


class Aa{

  int n ;
  int num;
  static int  number;
  void m1(){
    Aa a1= new Aa();
    System.out.println(a1.n);
    System.out.println(a1.num);
    System.out.println(number);
    System.out.println(n);
    System.out.println(num);
  }

}

class Bb{
    public static void main(String[] args) {
        Aa a2 = new Aa();
        a2.n = 5;
        a2.num = 10;
        a2.number = 7;
        a2.m1();
    }
}
