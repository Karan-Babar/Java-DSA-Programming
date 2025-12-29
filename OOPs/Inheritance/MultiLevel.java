package OOPs.Inheritance;

public class MultiLevel {

    public static void main(String[] args) {
        
         Dog d1 = new Dog();
         d1.eat();
         d1.legs = 4;
         System.out.println(d1.legs);
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

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}