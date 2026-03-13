package LinkedList;

public class Search {
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

    public void searchKey(int key){
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }

        int i = 0;
        Node temp = head;
        while (temp != null) {
            if(temp.data == key){
                System.out.println("Key found at index : " + i);
                return;
            }
            i++;
            temp = temp.next;
        }

        System.out.println("Key is not found");
    }

    //Recursion method
    // public int  searchKey(Node head, int key, int i){
    //     if(head == null){
    //         return -1;
    //     }

    //     Node temp = head;
    //     if(temp.data == key){
    //         System.out.println("Key found at index : " + i);
    //         return i;
    //     }
        
    //    return searchKey(temp.next,key,i+1);
    // }

    public static void main(String[] args) {
        Search ll = new Search();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

      ll.searchKey(5);
    //System.out.println(ll.searchKey(head,4,0));
    }
}