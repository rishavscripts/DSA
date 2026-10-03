// 23. Insert a node at a given position in a doubly linked list.  
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
public class Problem23 {
    static Scanner sc = new Scanner(System.in);
    static Node head=null;
    public static void main(String[] args) {
        System.out.println("Enter the no of nodes: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the data: ");
            int data=sc.nextInt();
            System.out.println("Enter the position: ");
            int pos=sc.nextInt();
            head=insertAtPos(head,data,pos);
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
     public static Node insertAtPos(Node head, int data,int pos){
        Node node = new Node(data);
        if(pos==1){
            if(head!=null){
                node.next=head;
                head.prev=node;
            }
            head=node;
        }else{
            Node temp=head;
            for(int i=1;i<pos-1 && temp!=null;i++){
                temp=temp.next;
            }
            if(temp!=null){
                node.next=temp.next;
                if(temp.next!=null){temp.next.prev=node;}
                temp.next=node;
                node.prev=temp;
            }else{
                System.out.println("Position is greater than the length of the list. Insertion failed.");
            }
        }
        return head;
    }
}

/*
    Algorithm: Insert Node at a Given Position in Doubly Linked List
Start

Create a new node with the given data.

If pos == 1:

If the list is not empty (head != null):

Set node.next = head (new node points forward to old head).

Set head.prev = node (old head points backward to new node).

Update head = node (new node becomes the head).

Else (insertion at position other than 1):

Initialize a temporary pointer temp = head.

Traverse the list until you reach the node at position pos - 1 (using a loop).

If temp != null:

Set node.next = temp.next (new node points forward to the node currently at position pos).

If temp.next != null:

Set temp.next.prev = node (the node at position pos points backward to the new node).

Set temp.next = node (node at position pos - 1 points forward to new node).

Set node.prev = temp (new node points backward to node at position pos - 1).

Else:

Print "Position is greater than the length of the list. Insertion failed."

Return head.

Stop
*/