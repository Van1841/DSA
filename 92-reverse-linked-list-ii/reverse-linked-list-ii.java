class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> vb = new ArrayList<>();
        ListNode temp = head;

        // Step 1: Copy all values to ArrayList
        while (temp != null) {
            vb.add(temp.val);
            temp = temp.next;
        }

        // Step 2: Reverse the required part
        left--;  // zero-based index
        right--;
        while (left < right) {
            int rev = vb.get(left);
            vb.set(left, vb.get(right));
            vb.set(right, rev);
            left++;
            right--;
        }

        // Step 3: Create new ListNode with updated values
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : vb) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }
}
