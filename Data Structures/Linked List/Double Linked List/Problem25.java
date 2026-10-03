//25. Delete the tail node of a doubly linked list.  
import java.util.*;
class Node{

    // Node Structure
    public int data;
    public Node prev;
    public Node next;

    //Constructors
    Node(int data){this.data=data; this.prev=null; this.next=null;}
    Node(int data,Node prev,Node next){this.data=data; this.prev=prev; this.next=next;}
    Node(){this.data=-1; this.next=null; this.prev=null;}    
}
public class Problem25 {
    static Scanner sc = new Scanner(System.in);
    static Node head;
    public static void main(String[] args) {
        
        head = new Node(1);
        head.next = new Node(2, head, null);
        head.next.next = new Node(3, head.next, null);
        head.next.next.next = new Node(4, head.next.next, null);
        head.next.next.next.next = new Node(5, head.next.next.next, null);

        System.out.println("Original Doubly Linked List:");
        printDoublyList(head);

        deleteTail();

        System.out.println("\nDoubly Linked List after deleting the tail node:");
        printDoublyList(head);
    }
    public static void printDoublyList(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void deleteTail() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete tail.");
            return;
        }
        if (head.next == null) { // Only one node in the list
            head = null; // Delete the only node
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; // Traverse to the last node
        }
        current.prev.next = null; // Second last node's next becomes null, removing the last node
    }
}
/*
Algorithm: Delete Tail Node of Doubly Linked List
Start

If the list is empty (head == null):

Print "List is empty. Cannot delete tail."

Stop.

If the list has only one node (head.next == null):

Set head = null (delete the only node).

Stop.

Else (list has more than one node):

Initialize a pointer current = head.

Traverse the list until current.next == null (reach the last node).

Update the second last node’s next pointer: current.prev.next = null (removes the last node).

Stop
*/