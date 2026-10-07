// 41. Delete a node at a given position in a circular linked list.  
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem41 {
    static Node head;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head; // Making it circular

        System.out.println("Original Circular List:");
        printList(head);

        int positionToDelete = 2; // Change this to test different positions
        deleteNodeAtPosition(positionToDelete);

        System.out.println("Circular List after deleting node at position " + positionToDelete + ":");
        printList(head);
    }
    public static void printList(Node head) {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    public static void deleteNodeAtPosition(int position) {
        if (head == null || position < 0) {
            System.out.println("Invalid position or empty list.");
            return;
        }

        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            // Find the last node to update its next pointer
            while (temp.next != head) {
                temp = temp.next;
            }
            if (temp == head) { // Only one node in the list
                head = null;
            } else {
                temp.next = head.next;
                head = head.next;
            }
            return;
        }

        // Traverse to the node at the given position
        for (int i = 0; temp.next != head && i < position - 1; i++) {
            temp = temp.next;
        }

        // If the position is more than the number of nodes
        if (temp.next == head) {
            System.out.println("Position exceeds the number of nodes.");
            return;
        }

        // Delete the node at the given position
        temp.next = temp.next.next;
    }   
}
