package JianzhiOffer;

public class Offer_27_mirrorTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode mirrorTree(TreeNode root) {
        dfs(root);
        return root;
    }
    public void dfs(TreeNode root) {
        if (root!=null){
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            dfs(root.left);
            dfs(root.right);
        }
    }
}
