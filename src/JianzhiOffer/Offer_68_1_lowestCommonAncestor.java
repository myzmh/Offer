package JianzhiOffer;

public class Offer_68_1_lowestCommonAncestor {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }
        while (!(root.val <= q.val && root.val >= p.val)) {
            if (root.val > q.val) root = root.left;
            if (root.val < p.val) root = root.right;
        }
        return root;
    }
}
