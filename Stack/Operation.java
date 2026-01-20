package Stack;

import java.util.Stack;

public class Operation {
    
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);   // [10, 20, 30]

        // Pop element
        stack.pop();
        System.out.println(stack);   // [10, 20]

        // Peek (top element)
        System.out.println(stack.peek()); // 20
    }
}