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
    public ListNode middleNode(ListNode head) {
        ListNode cursor = head;
        int countlen = 0;
        while(cursor!= null){
            countlen++;
            cursor = cursor.next;
        }
        ListNode point = head;
        for(int i = 1; i < (countlen/2)+1; i++){
            point = point.next;
        }
        return point;
    }
}