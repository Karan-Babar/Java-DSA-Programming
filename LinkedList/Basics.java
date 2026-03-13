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
    public static int size;

    public void addFirst(int data){
        //Create new node
        Node newNode = new Node(data);
        size++;
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
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode; //Link
        tail = newNode;
    }

    // Remove from start
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if(size == 1){
            head = tail = null;
            size--;
            return;
        }

        head = head.next;
        size--;
    }

    // Remove from end
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if(size == 1){
            head = tail = null;
            size--;
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
        size--;
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
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.removeFirst();
        ll.removeLast();
         
        ll.print();
        System.out.println(ll.size);
    }
}