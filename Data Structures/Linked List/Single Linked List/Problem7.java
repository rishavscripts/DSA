// 7. Search for an element in a singly linked list.  
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem7 {
    static Node head=null;
    static Scanner sc = new Scanner(System.in);
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
    public static boolean isPresent(Node head,int target){
        Node t=head;
        while(t!=null){
            if(t.data==target) return true;
            else{t=t.next;}
        }
        return false;
    }
    public static int search(Node head, int target){
        if(!isPresent(head, target)) return -1;
        Node t=head;
        int pos=0;
        while(t!=null){
            if(t.data==target) break;
            else{pos++; t=t.next;}
        }
        return pos;
    }
    public static void print(Node head){
        System.out.println("The Linked List :");