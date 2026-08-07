class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
public class LengthOfLL {
    static ListNode head;
     public static ListNode insertAtHead(ListNode head, int data){
        
        ListNode node = new ListNode(data);
        node.next=head;
        head=node;        
        return head;
    }
    public static void main(String[] args){
        head=insertAtHead(head, 3);
        head=insertAtHead(head, 2);
        head=insertAtHead(head, 1);
        head=insertAtHead(head, 0);
        System.out.println("Length of the Linked List is "+lengthOfLL(head));
    }
    public static int lengthOfLL(ListNode head){
        int sum=0;
        while(head!=null){
            sum++;
            head=head.next;
        }
        return sum;
    }
}
