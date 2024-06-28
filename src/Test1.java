import java.util.Scanner;

class Book{
    String name;
    String author;
    double price;

    Book(String n,String a,double p){
        this.name=n;
        this.author=a;
        this.price=p;
    }

    void display(){
        System.out.println("Book name: " +name);
        System.out.println("Author name: "+author);
        System.out.println("Price of the book: "+price);
    }

}

class BookEntry{
    static Book BookEntr(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the Book: ");
        String n = s.nextLine();
        System.out.println("Enter the author's name: ");
        String a = s.nextLine();
        System.out.println("Enter the price of the Book: ");
        double p = s.nextDouble();
      return new Book(n,a,p);
    } 
}

class Test1 {

    public static void main(String[] args) {
        Book b1 = BookEntry.BookEntr();
        b1.display();
    }

}
