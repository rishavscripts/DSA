// 5. Delete the last node of a singly linked list.
class Node{
    public int data;
    public Node next;
    Node(){this.data=-1; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Problem5 {
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
        // static initialization of Linked List.
        head=insertAtEnd(head, 0);
        head=insertAtEnd(head, 1);
        head=insertAtEnd(head, 2);
        // Main driver program.
        System.out.println("The Linked List before Deleting the last Node");
        print(head);
        head=deleteLastNode(head);
        System.out.println("The Linked List after Deleting the Last Node");
        print(head);
    }
     public static Node deleteLastNode(Node node){
        if(head==null || head.next==null) return null;
        Node t1=head;
        while(t1.next.next!=null){ t1=t1.next;}
        System.out.println("Deleted Node Data: "+t1.next.data);
        t1.next=null;
        return head;
    }
}
