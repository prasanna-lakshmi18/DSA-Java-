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
class Reverselin {
    public ListNode reverselin(ListNode node){
        ListNode pre=null;
        ListNode nex=null;
        while(node!=null){
            nex=node.next;
            node.next=pre;
            pre=node;
            node=nex;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }


        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverselin(slow.next);
        slow=slow.next;
        while(slow!=null){
            if(head.val!=slow.val){return false;}
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
}