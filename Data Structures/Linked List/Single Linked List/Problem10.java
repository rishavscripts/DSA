// 10. Reverse a singly linked list (recursive).  
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList(head);

        head = reverseList(head);

        System.out.println("Reversed list:");
        printList(head);
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
/*
    Algorithm: Reverse a Linked List (Recursive)
Start

If the head is null OR head.next is null:

Return head (base case: empty list or single node).

Recursively call reverseList(head.next) and store the result in newHead.

This call will reverse the rest of the list beyond the current node.

Adjust pointers to reverse the current link:

Set head.next.next = head (make the next node point back to the current node).

Set head.next = null (break the forward link to avoid cycles).

Return newHead (which is the head of the fully reversed list).

Stop
*/