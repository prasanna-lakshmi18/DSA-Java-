/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> h1=new HashMap<>();
        HashMap<ListNode,Integer> h2=new HashMap<>();
        int i=0;
        int j=0;
        int k=0;
        while(headA!=null || headB!=null){
            if(headA!=null){
                if(h2.containsKey(headA)){
                    return headA;
                }
                else{
                    h1.put(headA,i++);
                    headA=headA.next;
                }
            }
            System.out.println(k++);
            if(headB!=null){
                if(h1.containsKey(headB)){
                    return headB;
                }
                else{
                    h2.put(headB,j++);
                    //System.out.println
                    headB=headB.next;
                }
            }
        }    
        return null;
    }
}