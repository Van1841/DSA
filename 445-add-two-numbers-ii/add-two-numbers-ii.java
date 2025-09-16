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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack <>();
        Stack<Integer> st2 = new Stack <>();
        ListNode ans = null;

        ListNode temp = l1;
        while(temp != null){
            st1.push(temp.val);
            temp = temp.next;
        }
        ListNode temp1 = l2;
        while(temp1 != null){
            st2.push(temp1.val);
            temp1 = temp1.next;
        }

        int carry = 0;

        while(!st1.isEmpty() || !st2.isEmpty() || carry != 0){
            int a = st1.isEmpty() ? 0 :st1.pop();
            int b = st2.isEmpty() ? 0 :st2.pop();

            int value = a + b + carry;
            carry = value / 10;

            ListNode p = new ListNode(value % 10);
            p.next = ans;
            ans = p;
        }
        return ans;
    }
}