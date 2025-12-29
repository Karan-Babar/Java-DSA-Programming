package OOPs.Inheritance;

public class Hybrid {
    
    //combines two or more other types of inheritance 
    // (such as single, multiple, multilevel, or hierarchical) 
    // into a single program structure.
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

//child class
class Peacock extends Bird{
    void talk(){
        System.out.println("Talk");
    }
}
class Cat extends Mammal{
    void drinkMilk(){
        System.out.println("Cat drink milk");
    }
}

