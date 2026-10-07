// 26. Delete a node at a given position in a doubly linked list.
import java.util.*;
class Node{
    public int data;
    public Node next;
    public Node prev;
    Node(){this.data=-1; this.next=null; this.prev=null;}
    Node(int data){this.data=data; this.next=null; this.prev=null;}
    Node(int data, Node next, Node prev){this.data=data; this.next=next; this.prev=prev;}
}
public class Problem26 {
    static Node head;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2, null, head);
        head.next.next = new Node(3, null, head.next);
        head.next.next.next = new Node(4, null, head.next.next);
        head.next.next.next.next = new Node(5, null, head.next.next.next);

        System.out.println("Original List:");
        printList(head);

        int positionToDelete = 2; // Change this to test different positions
        deleteNodeAtPosition(positionToDelete);

        System.out.println("List after deleting node at position " + positionToDelete + ":");
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
    public static void deleteNodeAtPosition(int position) {
        if (head == null || position < 0) {
            System.out.println("Invalid position or empty list.");
            return;
        }

        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        // Traverse to the node at the given position
        for (int i = 0; temp != null && i < position; i++) {
            temp = temp.next;
        }

        // If the position is more than the number of nodes
        if (temp == null) {
            System.out.println("Position exceeds list length.");
            return;
        }

        // Unlink the node from the list
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }   
}
