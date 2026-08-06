import java.util.*;
class ListNode {
    int data;
    ListNode next;

    ListNode() {
        this.data = 0;
        this.next = null;
    }

    ListNode(int x) {
        this.data = x;
        this.next = null;
    }

    ListNode(int x, ListNode next) {
        this.data = x;
        this.next = next;
    }
}
public class DeletionAtHead {
    static Scanner sc = new Scanner(System.in);
    static ListNode head;
    public static void main(String[] args) {
       head=insertAtHead(head, 3);
       head=insertAtHead(head, 2);
       head=insertAtHead(head, 1);
       System.out.println("Initital Linked List: ");
       print(head);
       head=deleteAtHead(head);
        System.out.println("Changed Linked List: ");
        print(head);
    }
    public static void print(ListNode head){
        System.out.println("The Linked List :");
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static ListNode insertAtHead(ListNode head, int data){
        
        ListNode node = new ListNode(data);
        node.next=head;
        head=node;        
        return head;
    }
    public static ListNode deleteAtHead(ListNode head){
        System.out.println("Deleted Node Data: "+head.data);
        head=head.next;
        return head;
    }
}
