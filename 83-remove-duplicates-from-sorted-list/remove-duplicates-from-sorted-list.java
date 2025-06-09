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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cursor = head; //cursor = 1;
        if(cursor == null) return head;
        while(cursor.next != null){
            if(cursor.val == cursor.next.val){
                cursor.next = cursor.next.next;
            }else{
            cursor = cursor.next;
            }
        }
        return head;
        
    }
}