// 21. Insert a node at the head of a doubly linked list.
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
public class Problem21 {
    static Scanner sc = new Scanner(System.in);
    static Node head=null;
    public static void main(String[] args) {
        System.out.println("Enter the no of nodes: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the data: ");
            int data=sc.nextInt();
            head=insertAtBegin(head,data);
            print(head);
        }
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
}
/*
Algorithm: Insert Node at Beginning of Doubly Linked List
Start

Create a new node with the given data.

If the list is not empty (head != null):

Set node.next = head (new node points forward to old head).

Set head.prev = node (old head points backward to new node).

Update head = node (new node becomes the head of the list).

Return head.

Stop
*/