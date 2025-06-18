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
class ReverseList1 {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;       
        
        // Create a stack to temporarily
        //store the data values
        Stack<Integer> stack = new Stack<>();  

        // Step 1: Push the values of the
        // linked list onto the stack
        while (temp != null) {
             // Push the current node's
             // data onto the stack
            stack.push(temp.val); 
             // Move to the next node
             // in the linked list
            temp = temp.next;      
        }
         // Reset the temporary pointer
         // to the head of the linked list
        temp = head;  

        // Step 2: Pop values from the stack
        // and update the linked list
        while (temp != null) {
            // Set the current node's data
            // to the value at the top of the stack
            temp.val = stack.pop();  
            // Move to the next node
            // in the linked list
            temp = temp.next;         
        }
        // Return the new head of
        // the reversed linked list
        return head;  
    }
}