package LinkedList;

import java.util.*;

public class mergeSort {
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

    public Node getMid(Node head){
       Node slow = head;
       Node fast = head.next;

       while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
       }

       return slow;
    }

    public Node sort(Node head){
       if(head == null || head.next == null){
        return head;
       }

       Node mid = getMid(head);
       Node rightNode = mid.next;
       mid.next = null;

       Node newLeft = sort(head);
       Node newRight = sort(rightNode);

       return merge(newLeft, newRight);
    }

    public Node merge(Node head1, Node head2){
        
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            } else {
               temp.next = head2;
               head2 = head2.next;
            }
            temp = temp.next;
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return dummy.next;
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
        
        mergeSort ll = new mergeSort();

        ll.addLast(3);
        ll.addLast(1);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(4);
        
        ll.print();
        ll.head = ll.sort(ll.head);
        ll.print();
    }
}