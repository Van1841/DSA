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
    public boolean findTarget(TreeNode root, int k) {
        HashSet <Integer> ans = new HashSet<>();
        return fn(root,ans,k);
    }
    private boolean fn(TreeNode root,HashSet<Integer> ans, int k){
        if(root == null) return false;
        if(ans.contains(k - root.val)) return true;
        ans.add(root.val);
        return fn(root.left,ans,k) || fn(root.right,ans,k);
    }
    
}