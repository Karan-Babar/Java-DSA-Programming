package Strings;

public class stringBuffer {
    public static void main(String[] args) {

        //Create StringBuffer
        StringBuffer sb = new StringBuffer("Java");

        //append()
        sb.append(" DSA");
        System.out.println("After append: " + sb);

        //insert()
        sb.insert(4, " is");
        System.out.println("After insert: " + sb);

        //replace()
        sb.replace(0, 4, "Python");
        System.out.println("After replace: " + sb);

        //delete()
        sb.delete(7, 11);
        System.out.println("After delete: " + sb);

        //reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        //capacity()
        System.out.println("Capacity: " + sb.capacity());

        //length()
        System.out.println("Length: " + sb.length());
    }
}

