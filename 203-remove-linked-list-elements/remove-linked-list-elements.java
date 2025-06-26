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
    public ListNode removeElements(ListNode head, int val) {
        ListNode demo = new ListNode(0 , head);
        ListNode curr = demo;

        while(curr != null){
            while(curr.next != null && curr.next.val == val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return demo.next;
    }
}