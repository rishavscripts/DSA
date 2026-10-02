//12. Detect if a cycle exists in a singly linked list (Floyd’s algorithm). 
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Probelm12 {
    static Scanner sc = new Scanner(System.in);
    static Node head;
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a cycle for testing
        head.next.next.next.next.next = head.next; // 5 -> 2

        if (hasCycle(head)) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
    public static boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }

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
}
/*
Algorithm: Detect Cycle in Linked List
Start

If the head of the linked list is null, return false (no cycle).

Initialize two pointers:

slow = head (moves one step at a time)

fast = head (moves two steps at a time)

While fast is not null AND fast.next is not null:

Move slow one step forward (slow = slow.next)

Move fast two steps forward (fast = fast.next.next)

If at any point slow == fast, return true (cycle detected).

If the loop ends without slow meeting fast, return false (no cycle).

Stop
*/