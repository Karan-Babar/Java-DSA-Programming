package OOPs;

public class Polymorphism {
    
    //Polymorphism
    public static void main(String[] args) {
        Calculater c1 = new Calculater();
        System.out.println(c1.sum(2, 4));
        System.out.println(c1.sum((float)1.3, (float)3.4));
        System.out.println(c1.sum(2, 4, 6));

        Deer d1 = new Deer();
        d1.eat();
    }
}

//Methos Overloading.
//Multiple fuctions with the same name but different parameters.
class Calculater {
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
}

//Method Overriding.
//Parent and child classes both contains the same function with a different definition.
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer{
    void eat(){
        System.out.println("eatss grass");
    }
}