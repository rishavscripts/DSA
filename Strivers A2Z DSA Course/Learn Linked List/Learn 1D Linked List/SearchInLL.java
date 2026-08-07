import java.util.*;
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
public class SearchInLL {
    static Scanner sc = new Scanner(System.in);
    static ListNode head;
    public static ListNode insertAtHead(ListNode head, int data){
        
        ListNode node = new ListNode(data);
        node.next=head;
        head=node;        
        return head;
    }
    public static void main(String[] args) {
        head=insertAtHead(head, 3);
        head=insertAtHead(head, 2);
        head=insertAtHead(head, 1);
        head=insertAtHead(head, 0);
        System.out.println("Enter the node data to find : ");
        int target=sc.nextInt();
        System.out.println(searchKey(head,target));
    }
    public static boolean searchKey(ListNode head, int target){
        while(head!=null){
            if(head.data==target){return true;}
            else{head=head.next;}
        }
        return false;
    }
}
