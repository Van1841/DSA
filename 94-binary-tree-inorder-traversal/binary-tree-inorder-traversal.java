/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ll = new LinkedList<>();
        inord(root,ll);
        return ll;
    }
    public static void inord(TreeNode r, List<Integer> ll){
        if(r == null) return;
        inord(r.left, ll);
        ll.add(r.val);
        inord(r.right , ll);
    }
}
