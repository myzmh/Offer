package JianzhiOffer;

public class Offer_28_isSymmetric {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : dfs(root.left,root.right);
    }
    public boolean dfs(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right==null || left.val != right.val){
            //这里是为什么？怎么用||,这里不会报空指针异常吗
            return false;
        }
        return dfs(left.left,right.right) && dfs(right.left,left.right);
    }

    public boolean dfs(TreeNode root) {
        boolean left = true,right = true;
        if (root!=null){
            if(root.left == null && root.right == null) {
                return true;
            }
            if(root.left != null && root.right!=null && root.left.val != root.right.val){
                return false;
            }
//            left = dfs(root.left);
//            right = dfs(root.right);

        }
        return dfs(root.left) && dfs(root.right);
//        return left && right;
    }

    public static void main(String[] args) {
        Offer_28_isSymmetric offer_28_isSymmetric = new Offer_28_isSymmetric();
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        treeNode.left = left;
        treeNode.right = right;
        left = new TreeNode(3);
        right = new TreeNode(4);
        treeNode.left.left = left;
        treeNode.left.right = right;
        left = new TreeNode(4);
        right = new TreeNode(3);
        treeNode.right.left = left;
        treeNode.right.right = right;

        TreeNode treeNode1 = null;
        System.out.println(treeNode1.val);

        System.out.println(offer_28_isSymmetric.isSymmetric(treeNode));
    }
}
