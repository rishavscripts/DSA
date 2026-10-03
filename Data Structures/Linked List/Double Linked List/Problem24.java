// 24. Delete the head node of a doubly linked list.  
import java.util.*;
class Node{

    // Node Structure
    public int data;
    public Node prev;
    public Node next;

    //Constructors
    Node(int data){this.data=data; this.prev=null; this.next=null;}
    Node(int data,Node prev,Node next){this.data=data; this.prev=prev; this.next=next;}
    Node(){this.data=-1; this.next=null; this.prev=null;}    
}
public class Problem24 {
    static Scanner sc = new Scanner(System.in);
    static Node head=null;
    public static void main(String[] args) {
         // static initialization of Linked List.
        head=insertAtBegin(head, 0);
        head=insertAtBegin(head, 1);
        head=insertAtBegin(head, 2);
        // Main driver program.
        System.out.println("Before Deleting the First Node: ");
        print(head);
        head=deleteFirstNode(head);
        System.out.println("After Deleting the First Node: ");
        print(head);
    }
     public static void print(Node head){
        System.out.println("The Linked List :");
        Node t=head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
    }
    public static Node insertAtBegin(Node head, int data){
        Node node= new Node(data);
        if (head != null) {
            node.next = head;
            head.prev = node; 
        }
        head = node;
        return head;
    }
    public static Node deleteFirstNode(Node head){
        if(head==null){return null;}
        Node temp=head;
        head=head.next;
        if(head!=null){head.prev=null;}
        temp.next=null; // Optional: Clear the next pointer of the deleted node
        return head;
    }
}
/*
    Algorithm: Delete First Node of Doubly Linked List
Start

If the list is empty (head == null):

Return null (nothing to delete).

Store the current head in a temporary pointer temp = head.

Move the head forward: head = head.next.

If the new head is not null:

Set head.prev = null (remove backward link to deleted node).

Clear the deleted node’s forward link: temp.next = null (optional cleanup).

Return the updated head.

Stop
*/