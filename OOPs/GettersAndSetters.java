package OOPs;

public class GettersAndSetters {
    public static void main(String[] args){
        Pen p1 = new Pen(); //created a pen object
        p1.setColor("Blue");
        System.out.println(p1.getColor()); 
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("red");
        System.out.println(p1.getColor());
    }
}
 
//class
class Pen {
    private String color;
    private int tip;

    public String getColor() {
        return this.color;
    }

    public int getTip() {
        return this.tip;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setTip(int newTip) {
        this.tip = newTip;
    }
}
