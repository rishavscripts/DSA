// 13. Remove a cycle from a singly linked list.
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem13 {
    static Node head;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a cycle for testing
        head.next.next.next.next.next = head.next; // 5 -> 2

        if (detectCycle(head)) {
            System.out.println("Cycle detected. Removing cycle...");
            removeCycle(head);
            System.out.println("Cycle removed.");
        } else {
            System.out.println("No cycle detected.");
        }

        System.out.println("List after removing cycle:");
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
    public static boolean detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }
    public static void removeCycle(Node head) {
        Node slow = head;
        Node fast = head;

        // Detect cycle
        do {
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        // Find the start of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Find the node just before the start of the cycle
        Node prev = null;
        while (fast.next != slow) {
            prev = fast;
            fast = fast.next;
        }

        // Remove the cycle
        prev.next = null;
    }
}
