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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        
        // Step 1: Compute the length of the list
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        
        // Step 2: Compute effective k
        k = k % length;
        if (k == 0) return head; // No rotation needed
        
        // Step 3: Connect tail to head to form a circular linked list
        tail.next = head;
        
        // Step 4: Find new tail (length - k - 1 steps from head)
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }
        
        // Step 5: Break the cycle and set new head
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}