// 11. Find the middle element of a singly linked list. 
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem11 {
    static Scanner sc = new Scanner(System.in);
    static Node head;
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList(head);

        Node middleNode = findMiddle(head);
        if (middleNode != null) {
            System.out.println("Middle element: " + middleNode.data);
        } else {
            System.out.println("The list is empty.");
        }
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
/*
Algorithm: Find Middle Node of Linked List
Start

If the head of the linked list is null, return null (empty list).

Initialize two pointers:

slow = head (moves one step at a time)

fast = head (moves two steps at a time)

While fast is not null AND fast.next is not null:

Move slow one step forward (slow = slow.next)

Move fast two steps forward (fast = fast.next.next)

When the loop ends, slow will be pointing to the middle node of the linked list.

Return slow.

Stop
*/