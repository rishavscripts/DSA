// 9. Reverse a singly linked list (iterative).  
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem9 {
    static Node head;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        head = new Node(1);
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
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
/*
    Algorithm: Reverse a Linked List (Iterative)
Start

Initialize three pointers:

prev = null (to store the previous node)

current = head (to traverse the list)

next = null (to temporarily store the next node)

While current is not null:

Save the next node: next = current.next

Reverse the link: current.next = prev

Move prev one step forward: prev = current

Move current one step forward: current = next

When the loop ends, prev will point to the new head of the reversed list.

Return prev.

Stop
*/