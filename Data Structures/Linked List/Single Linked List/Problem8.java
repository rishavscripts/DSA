//8. Count the number of nodes in a singly linked list.  
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem8 {
    static Scanner sc = new Scanner(System.in);
    static Node head=null;
    public static void print(Node head){
        System.out.println("The Linked List :");
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static Node insertAtEnd(Node head, int data) {
        Node node = new Node(data);
        if (head == null) {return node;}
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        return head;
    }
    public static void main(String[] args) {
        // static LL creation system generated.
        head=insertAtEnd(head, 0);
        head=insertAtEnd(head, 1);
        head=insertAtEnd(head, 2);
        head=insertAtEnd(head, 3);
        // Main code
        int listSize=listSize(head);
        System.out.println("the size of the Linked List is : "+listSize);
    }
    public static int listSize(Node head){
        if(head==null){return 0;}
        int count=0;