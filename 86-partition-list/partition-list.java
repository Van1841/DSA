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
    public ListNode partition(ListNode head, int x) {
        ListNode sl = new ListNode(0);
        ListNode bl = new ListNode(0);

        ListNode small = sl;
        ListNode big = bl;

        while(head != null){
            if(head.val < x){
                small.next = head;
                small = small.next;
            }else{
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }
        small.next = bl.next;
        big.next = null;
        return sl.next;
    }
}