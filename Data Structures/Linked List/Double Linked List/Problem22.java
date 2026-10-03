// 22. Insert a node at the tail of a doubly linked list.
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
public class Problem22 {
    static Scanner sc = new Scanner(System.in);
    static Node head=null;
    public static void main(String[] args) {
        System.out.println("Enter the no of nodes: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the data: ");
            int data=sc.nextInt();
            head=insertAtEnd(head,data);
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
    public static Node insertAtEnd(Node head, int data){
        Node node = new Node(data);
        if(head!=null){
            Node temp=head;
            while(temp.next!=null){temp=temp.next;}
            temp.next=node;
            node.prev=temp;
        }else{head=node;}
        return head;
    }
}
/*
    Algorithm: Insert Node at End of Doubly Linked List
Start

Create a new node with the given data.

If the list is not empty (head != null):

Initialize a temporary pointer temp = head.

Traverse the list until temp.next == null (reach the last node).

Set temp.next = node (last node points forward to new node).

Set node.prev = temp (new node points backward to last node).

If the list is empty (head == null):

Set head = node (new node becomes the head).

Return head.

Stop
*/