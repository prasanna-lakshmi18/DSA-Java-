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
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        int sum=0;
        int carry=0;
        while(l1!= null || l2!=null || carry==1){
            sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            if(carry==1){
                sum+=carry;
            }
            if(sum>9){
                carry=1;
                sum=sum%10;
            }
            else{
                carry=0;
            }
            System.out.println("Sum "+sum);
            ListNode node=new ListNode(sum);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;

    }
}