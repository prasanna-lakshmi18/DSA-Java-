/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;         // Copy next node's value into current node
        node.next = node.next.next;       // Skip over the next node (deleting it)
    }
}
