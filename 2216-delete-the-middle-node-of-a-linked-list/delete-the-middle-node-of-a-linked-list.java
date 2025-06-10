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
    public ListNode deleteMiddle(ListNode head) {
        ListNode cursor = head;
        int count = 0;

        if(cursor.next == null) return null;

        while(cursor != null){
            count++;
            cursor = cursor.next;
        }
        ListNode mid = head;
        for(int i = 0; i < (count/2)-1; i++){
            mid = mid.next;
        }
        mid.next = mid.next.next;
        
        return head;
    }
}