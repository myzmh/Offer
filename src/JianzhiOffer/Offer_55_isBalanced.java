package JianzhiOffer;

public class Offer_55_isBalanced {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isBalanced(TreeNode root) {
        return dfs(root) == -1 ? false : true;
    }

    public int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        if (left == -1) return -1;
        int right = dfs(root.right);
        if (right == -1) return -1;
        if (left - right > 1 || right - left > 1) return -1;
        return Math.max(left,right) + 1;
    }

    public boolean isBalanced2(TreeNode root) {
        if (root == null) return true;
        return Math.abs(depth(root.left)-depth(root.right)) <=1 && isBalanced2(root.left) && isBalanced2(root.right);
    }

    public int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left),depth(root.right)) + 1;
    }
}
