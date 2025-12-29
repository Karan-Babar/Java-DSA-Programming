package OOPs.Inheritance;

public class SingleLevel {
    
    public static void main(String[] args) {
        Fish dolphin = new Fish();
        dolphin.eat();
        dolphin.swim();
    }
}

//Base class / parent class
class Animal {
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}
//Derived class / child class
class Fish extends Animal {

    void swim(){
        System.out.println("Swims in water");
    }
}