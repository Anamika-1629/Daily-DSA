
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int count;

    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return count;
    }

    private int dfs(TreeNode n) {
        if (n == null) return 0;

        int l = dfs(n.left);
        int r = dfs(n.right);

        int max = Math.max(n.val, Math.max(l, r));

        if (n.val == max)
            count++;

        return max;
    }
}

public class DominantNodesInBinTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(1);

        Solution obj = new Solution();
        System.out.println(obj.countDominantNodes(root));
    }
}