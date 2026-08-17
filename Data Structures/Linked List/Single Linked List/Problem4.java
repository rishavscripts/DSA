// 4. Delete the first node of a singly linked list.  

class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem4 {
    static Node head=null;
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
    public static void print(Node head){
        System.out.println("The Linked List :");
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        // static initialization of Linked List.
        head=insertAtEnd(head, 0);
        head=insertAtEnd(head, 1);
        head=insertAtEnd(head, 2);
        // Main driver program.
        System.out.println("Before Deleting the First Node: ");
        print(head);
        head=deleteFirstNode(head);
        System.out.println("After Deleting the First Node: ");
        print(head);
    }
    public static Node deleteFirstNode(Node head){
        System.out.println("The deleted Node data : "+head.data);
        head=head.next;
        return head;
    }
}