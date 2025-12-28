package OOPs;

public class Constructors {

    public static void main(String[] args) {
        Student s1 = new Student("karan",50);
        System.out.println(s1.name);
        System.out.println(s1.roll);
    }
}

class Student {
    String name;
    int roll;

    Student (String name, int roll){   //Constructor
        this.name = name;
        this.roll = roll;
    }
}