//1. Implement insertion at the beginning of a singly linked list. 

import java.util.*;
class Node{

    // Node structure
    public int data;
    public Node next;

    // Constructors
    Node(int data){this.data=data;this.next=null;}
    Node(int data, Node next){this.data=data;this.next=next;}
    Node(){this.data=-1; this.next=null;}

}
public class Problem1{
    static Scanner sc = new Scanner(System.in);
    static Node head=null;
    public static void main(String[] args){
        System.out.println("Enter the no of nodes: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the data: ");
            int data=sc.nextInt();
            head=insertAtBegin(head,data);
        }
    }
    public static Node insertAtBegin(Node head, int data){
        Node node= new Node(data);
        if(head==null){head=node;}
        else{ 
            node.next=head;
            head=node;
        }
        return head;
    }
}