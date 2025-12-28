package OOPs;

public class Constructors {

    public static void main(String[] args) {
        Student s1 = new Student("karan",50);
        Student s2 = new Student();
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s3 = new Student(s1); //Copy Constructor

        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
        System.out.println(s3.marks[i]);
       }
    }
}

class Student {
    String name;
    int roll;
    int marks[];

    //Types of Constructors

    //Shallow Copy Constructor (only references copy) changes reflect.
    // Student (Student s1){
    //    marks = new int[3];
    //    this.name = s1.name;
    //    this.roll = s1.roll;
    //    this.marks = s1.marks;
    //    System.out.println(name);
    //    System.out.println(roll);  
    // }

    //Deep Copy Constructor () changes don't reflect.
     Student (Student s1){
       marks = new int[3];
       this.name = s1.name;
       this.roll = s1.roll;
       for(int i=0; i<marks.length; i++){
          this.marks[i] = s1.marks[i];
       }
       System.out.println(name);
       System.out.println(roll);  
    }

    //Parameterized Constructor
    Student (String name, int roll){   //Constructor
        marks = new int[3];
        this.name = name;
        this.roll = roll;
        System.out.println(name);
        System.out.println(roll);
    }

    //Non-Parameterized Constructor
    Student (){
        marks = new int[3];
        System.out.println("constructor is called...");
    }
}