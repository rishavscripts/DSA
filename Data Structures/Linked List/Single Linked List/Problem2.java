// 2. Implement insertion at the end of a singly linked list.
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem2 {
    static Node head=null;
    static Scanner sc =new Scanner(System.in);
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
}