import java.util.*;
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
public class InsertionAtHead {
    static ListNode head;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the no of nodes: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the data: ");
            int data=sc.nextInt();
            head=insertAtHead(head,data);
            print(head);
        }
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
}
