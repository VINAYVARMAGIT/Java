import java.util.Scanner;

public class StudentGrading{

    public static void main(String[] args) {
        
        System.out.println("The percentage acquired by the student: ");
        Scanner s = new Scanner(System.in);
        int percent = s.nextInt();

        

        if (percent >= 91 && percent <=100) {

            System.out.println("Students's grade is A.");            
        } else if (percent >= 81 && percent <=90) {

            System.out.println("Student's grade is B.");        
            
        }
        else if (percent >= 71 && percent <=80) {

            System.out.println("Student's grade is C.");        
            
        }
        else if (percent >= 61 && percent <=70) {

            System.out.println("Student's grade is D.");        
            
        }
        else if (percent >= 51 && percent <=60) {

            System.out.println("Student's grade is E");        
            
        }
        else System.out.println("Student has failed");
        
    }
}

