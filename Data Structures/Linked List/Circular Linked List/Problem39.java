// 39. Delete the head node of a circular linked list.import java.util.*;
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem39 {
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

        deleteHead();

        System.out.println("\nCircular Linked List after deleting the head node:");
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
    public static void deleteHead() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete head.");
            return;
        }
        if (head.next == head) { // Only one node in the list
            head = null; // Delete the only node
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next; // Traverse to the last node
        }
        temp.next = head.next; // Last node points to the second node
        head = head.next; // Update head to the second node
    }
}
/*
Algorithm: Delete Head Node of Circular Linked List
Start

If the list is empty (head == null):

Print "List is empty. Cannot delete head."

Stop.

If the list has only one node (head.next == head):

Set head = null (delete the only node).

Stop.

Else (list has more than one node):

Initialize a temporary pointer temp = head.

Traverse the list until temp.next == head (reach the last node).

Set temp.next = head.next (last node points to the second node).

Update head = head.next (new head becomes the second node).

Stop
*/