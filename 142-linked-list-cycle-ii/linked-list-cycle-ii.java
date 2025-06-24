/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //  we use the Tortoise Hare Algorithm
        //  also known as FLOYD'S CYCLE DETECTION
        //ismei 2 pointers honge slow (moves 1 step) and fast (moves 2 steps)

        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
            // mtlb cycle hai !!
            ListNode entry = head;
            while(entry != slow){
                slow= slow.next;
                entry = entry.next;
            }
            return entry;
        }
        }
        return null;
    }
}