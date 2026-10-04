// 36. Insert a node at the beginning of a circular linked list.  
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem36 {
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

        int newData = 0;
        insertAtBeginning(newData);

        System.out.println("\nCircular Linked List after inserting " + newData + " at the beginning:");
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
    public static void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode; // Point to itself
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next; // Traverse to the last node
            }
            temp.next = newNode; // Last node points to new node
            newNode.next = head; // New node points to head
            head = newNode; // Update head to new node
        }
    }
}

/*
Algorithm: Insert Node at Beginning of Circular Linked List
Start

Create a new node with the given data.

If the list is empty (head == null):

Set newNode.next = newNode (node points to itself, forming a single-node circular list).

Update head = newNode.

Else (list is not empty):

Initialize a temporary pointer temp = head.

Traverse the list until temp.next == head (reach the last node).

Set temp.next = newNode (last node points to new node).

Set newNode.next = head (new node points to old head).

Update head = newNode (new node becomes the new head).

Stop
*/