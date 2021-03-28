package JianzhiOffer;

import java.util.LinkedList;
import java.util.Queue;

public class Offer_55_maxDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            for (int i = queue.size(); i > 0; i--) {
                TreeNode top = queue.poll();
                if (top.left != null) queue.offer(top.left);
                if (top.right != null) queue.offer(top.right);
            }
            res++;
        }
        return res;
    }
    public int maxDepthDFS(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepthDFS(root.left), maxDepthDFS(root.right)) + 1;
    }
}
