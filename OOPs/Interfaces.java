package OOPs;

//Interfaces (Multiple Inheritance)
public class Interfaces {
    
    public static void main(String[] args) {
        XUV300 obj1 = new XUV300();
        obj1.color();
        obj1.speed();
    }
}

//Interface is a blueprint of a class
interface car {
    void color();
}
interface engine {
    void speed();
}

class XUV300 implements car, engine{
    public void color(){
      System.out.println("car color is white");
    }
    public void speed(){
      System.out.println("speed is 200kph");
    }
}