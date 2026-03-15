package LinkedList;

public class DeleteMid {
    
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
         
        public void mid(){

            if(size == 1){
                head = null;
                return;
            }

            int mid = size / 2;
            int i = 1;
            Node prev = head;
            while (i != mid) {
                prev = prev.next;
                i++;
            }

            prev.next = prev.next.next;
        }

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
            DeleteMid ll = new DeleteMid();
            
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.addLast(6);
            ll.addLast(7);
            // ll.addLast(8);

            ll.print();
            ll.mid();
            ll.print();
        }
}
