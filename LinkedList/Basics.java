package LinkedList;

public class Basics {
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

    public void addFirst(int data){
        //Create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //newNode next = head
        newNode.next = head; //Link
        //head = newNode
        head = newNode;
    }

    public void addLast(int data){
        //Create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode; //Link
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Basics ll = new Basics();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();
    }
}
