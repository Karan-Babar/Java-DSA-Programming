package OOPs;

public class StaticKey {
    
    //static keyword in java is used to share the same variable or method of a given class.
    public static void main(String[] args) {
        student s1 = new student();
        student.schoolName = "G.H.raisoni";
        
        student s2 = new student();
        System.out.println(student.schoolName);
    }
}

class student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
