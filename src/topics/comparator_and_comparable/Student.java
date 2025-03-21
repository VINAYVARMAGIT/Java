package topics.comparator_and_comparable;

import java.util.Arrays;
import java.util.Comparator;

class StudentComparator implements Comparator{


    @Override
    public int compare(Object o1,Object o2){

        Student s1=  (Student)o1;
        Student s2=(Student) o2;
        return s1.name.compareTo(s2.name);
    }
}

class Student  implements Comparable<Object>{
    
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
       Student s = (Student)o;
       return  this.name.compareTo(s.name);
    }
}

class TestStudents
{
    public static void main(String[] args) {
        Student s1 = new Student(1,"vinay");
        Student s2 = new Student(1,"varma");
        Student s3 = new Student(1,"sid");
        Student s4 = new Student(1,"race");
        
        Student  [] s = {s1,s2,s3,s4};
        StudentComparator com = new StudentComparator();

       Arrays.sort(s,com);

        for (Student student : s) {
            System.out.println(student.name);
        }
    }
}