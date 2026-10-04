// 40. Delete the tail node of a circular linked list.  
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem40 {
    static Scanner sc = new Scanner(System.in);
    static Node head;
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head; // Making it circular

        System.out.println("Original Circular Linked List:");
        printCircularList(head);

        deleteTail();

        System.out.println("\nCircular Linked List after deleting the tail node:");
        printCircularList(head);
    }
    public static void printCircularList(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
    public static void deleteTail() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete tail.");
            return;
        }
        if (head.next == head) { // Only one node in the list
            head = null; // Delete the only node
            return;
        }
        Node current = head;
        while (current.next.next != head) {
            current = current.next; // Traverse to the second last node
        }
        current.next = head; // Second last node points to head, removing the last node
    }   
}
/*
Algorithm: Delete Tail Node of Circular Linked List
Start

If the list is empty (head == null):

Print "List is empty. Cannot delete tail."

Stop.

If the list has only one node (head.next == head):

Set head = null (delete the only node).

Stop.

Else (list has more than one node):

Initialize a pointer current = head.

Traverse the list until current.next.next == head (reach the second last node).

Set current.next = head (second last node points directly to head, removing the last node).

Stop
*/