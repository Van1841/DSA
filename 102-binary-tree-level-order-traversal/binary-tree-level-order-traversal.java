class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>(); // ✅ missing final list

        if (root != null) q.add(root);

        while (q.size() > 0) {
            int size = q.size();                      // ✅ level size
            List<Integer> l1 = new ArrayList<>();     // ✅ renamed from l1 → l1 (conflict resolved)

            for (int i = 0; i < size; i++) {
                TreeNode temp = q.remove();           // ✅ now remove correctly

                l1.add(temp.val);                     // ✅ correct: add int, not node

                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);

                System.out.print(temp.val + " ");
            }

            ans.add(l1);                              // ✅ add level to final
        }

        return ans;
    }
}
