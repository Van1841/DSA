class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Convert nums array to HashSet for O(1) lookups
        Set<Integer> toRemove = new HashSet<>();
        for(int num : nums) {
            toRemove.add(num);
        }
        
        // Handle case where head needs to be removed
        while(head != null && toRemove.contains(head.val)) {
            head = head.next;
        }
        
        // If all nodes were removed
        if(head == null) return null;
        
        ListNode current = head;
        
        while(current != null && current.next != null) {
            if(toRemove.contains(current.next.val)) {
                // Skip the next node
                current.next = current.next.next;
            } else {
                // Move to next node only if we didn't remove
                current = current.next;
            }
        }
        
        return head;
    }
}