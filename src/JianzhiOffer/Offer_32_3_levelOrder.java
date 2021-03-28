package JianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offer_32_3_levelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root!=null) queue.offer(root);
        while (!queue.isEmpty()) {
            LinkedList<Integer> rows = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode top = queue.poll();
                if (list.size() % 2 == 0) rows.addLast(top.val);
                else rows.addFirst(top.val);
                if (top.left != null) queue.offer(top.left);
                if (top.right != null) queue.offer(top.right);
            }
            list.add(rows);
        }
        return list;
    }
}
