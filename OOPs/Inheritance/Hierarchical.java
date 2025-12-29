package OOPs.Inheritance;

public class Hierarchical {
    
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Bird b1 = new Bird();
        b1.breathe();
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

//Multiple child class
class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}