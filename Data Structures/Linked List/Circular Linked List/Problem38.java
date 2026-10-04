// 38. Insert a node at a given position in a circular linked list.  
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem38 {
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

        int newData = 99;
        int position = 3; // Position to insert the new node
        insertAtPosition(newData, position);

        System.out.println("\nCircular Linked List after inserting " + newData + " at position " + position + ":");
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
    public static void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position <= 0) {
            System.out.println("Invalid position. Position should be greater than 0.");
            return;
        }
        if (head == null) {
            if (position == 1) {
                newNode.next = newNode; // Point to itself
                head = newNode;
            } else {
                System.out.println("List is empty. Cannot insert at position " + position);
            }
            return;
        }
        if (position == 1) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next; // Traverse to the last node
            }
            temp.next = newNode; // Last node points to new node
            newNode.next = head; // New node points to head
            head = newNode; // Update head to new node
        } else {
            Node current = head;
            for (int i = 1; i < position - 1 && current.next != head; i++) {
                current = current.next; // Traverse to the node before the desired position
            }
            if (current.next == head && position > 2) {
                System.out.println("Position exceeds the length of the list. Inserting at the end.");
                current.next = newNode; // Last node points to new node
                newNode.next = head; // New node points to head
            } else {
                newNode.next = current.next; // New node points to the next node
                current.next = newNode; // Current node points to new node
            }
        }
    }
}
/*
Algorithm: Insert Node at a Given Position in Circular Linked List
Start

Create a new node with the given data.

If position <= 0:

Print "Invalid position. Position should be greater than 0."

Stop.

If the list is empty (head == null):

If position == 1:

Set newNode.next = newNode (node points to itself).

Update head = newNode.

Else:

Print "List is empty. Cannot insert at position X".

Stop.

If position == 1 (insertion at beginning):

Initialize temp = head.

Traverse until temp.next == head (reach the last node).

Set temp.next = newNode (last node points to new node).

Set newNode.next = head (new node points to old head).

Update head = newNode (new node becomes the head).

Else (insertion at middle or end):

Initialize current = head.

Traverse the list until you reach the node at position pos - 1 (loop with i = 1 to pos - 1).

If traversal ends at last node (current.next == head and position > 2):

Print "Position exceeds the length of the list. Inserting at the end."

Set current.next = newNode (last node points to new node).

Set newNode.next = head (new node points back to head).

Else:

Set newNode.next = current.next (new node points to next node).

Set current.next = newNode (current node points to new node).

Stop
*/