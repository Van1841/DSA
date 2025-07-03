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
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root , 0);
        return res;        
    }

    private int dfs(TreeNode root , int maxi) {
        if (root == null) {
            return 0;
        }

        int l = dfs(root.left , 0);
        int r = dfs(root.right, 0);
        maxi = Math.max(l + r + root.val , maxi);

        res = Math.max(res, l + r);

        return 1 + Math.max(l, r);
    }    
}