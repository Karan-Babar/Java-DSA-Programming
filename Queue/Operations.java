package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Operations {
    
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue);   // [10, 20, 30]

        // Dequeue element
        queue.remove();
        System.out.println(queue);   // [20, 30]

        // Front element
        System.out.println(queue.peek()); // 20
    }
}