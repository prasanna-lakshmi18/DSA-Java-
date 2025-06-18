/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int count=0;
        ListNode curr=dummy,nex=dummy,pre=dummy;
        while(curr.next!=null){
            curr=curr.next;
            count++;
        }
        while(count>=k){
            curr=pre.next;
            nex=curr.next;
            for(int i=0;i<k-1;i++){
                curr.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=curr.next;
            }
            pre=curr;
            count-=k;
        }
        return dummy.next;
        
        
    }
}