package JianzhiOffer;

public class Offer_54_kthLargest {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int res;
    int lk;
    public int kthLargest(TreeNode root, int k) {
        lk = k;
        inOrder(root);
        return res;
    }
    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.right);
        if (lk == 0)return;
        lk--;
        if (lk == 0) res = root.val;
        inOrder(root.left);
    }
}
