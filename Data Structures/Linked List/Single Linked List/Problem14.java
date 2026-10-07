//14. Merge two sorted singly linked lists into one sorted list.  
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem14 {
    static Node head1, head2;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        System.out.println("List 1:");
        printList(head1);
        System.out.println("List 2:");
        printList(head2);

        Node mergedHead = mergeSortedLists(head1, head2);
        System.out.println("Merged List:");
        printList(mergedHead);
    }   
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node mergeSortedLists(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node mergedHead = null;

        if (head1.data < head2.data) {
            mergedHead = head1;
            mergedHead.next = mergeSortedLists(head1.next, head2);
        } else {
            mergedHead = head2;
            mergedHead.next = mergeSortedLists(head1, head2.next);
        }

        return mergedHead;
    }
}
