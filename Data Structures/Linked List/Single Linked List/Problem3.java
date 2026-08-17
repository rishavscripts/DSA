//3. Insert a node at a given position in a singly linked list. 
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem3 {
    static Node head=null;
    static Scanner sc = new Scanner(System.in);
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
        head=insertAtEnd(head, 4);
        // Main program
        System.out.println("Enter the position of the node: ");
        int pos=sc.nextInt();
        System.out.println("Enter the data: ");
        int data=sc.nextInt();
        head=insertAtPos(head,data,pos);
        print(head);
    }
    public static Node insertAtPos(Node head, int data, int pos){
        int length=length(head);
        if(pos>length || pos<0) {System.out.println("position does not exist. "); return head;}
        else if(pos==length){return insertAtEnd(head, data);}
        else{
            Node temp1=head;
            int i=0;
            while(i<pos-1){
                temp1=temp1.next;
                i++;
            }
            Node temp2=temp1.next;
            Node n = new Node(data);
            temp1.next=n;
            n.next=temp2;
            return head;
        }
    }
    public static int length(Node head){
        if(head==null) return 0;
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}