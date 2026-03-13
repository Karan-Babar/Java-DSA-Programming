package LinkedList;

public class Reverse {
    public static class Node{
       int data;
       Node next;

       public Node(int data){
          this.data = data;
          this.next = null;
       }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void reverse(){

        if(head == null){
            System.out.println("LL is Empty");
            return;
        }
        
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
        }
        head = prev;
    }

    //Recursion method
    // public void reverse(Node prev, Node curr){

    //     if(curr == null){
    //         head = prev;
    //         return;
    //     }
        
    //     Node next;

    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;

    //     reverse(prev, curr);
    // }

    public void print(){
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Reverse ll = new Reverse();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.print();
        ll.reverse();
        ll.print();
        // ll.reverse(null, head);
        // ll.print();
    }
}