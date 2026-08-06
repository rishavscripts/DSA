class Node{
    public int data;
    public Node next;
    Node(){this.data=0; this.next=null;}
    Node(int data){this.data=data; this.next=null;}
    Node(int data, Node next){this.data=data; this.next=next;}
}
public class Intro {
    static Node head;
    public static void main(String[] args) {
        Node n1= new Node(10);
        head=n1;
        print(head);
    }
    public static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
