package JianzhiOffer;

import java.util.LinkedList;
import java.util.Queue;

public class Offer_37_Codec {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "[]";
        StringBuilder str = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode top = queue.poll();
            if (top != null) {
                queue.offer(top.left);
                queue.offer(top.right);
                str.append(top.val+",");
            } else {
                str.append("null,");
            }
        }
        str.deleteCharAt(str.length() - 1);
        str.append("]");
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize1(String data) {
        if (data.equals("[]")) return null;
        String[] str = data.substring(1, data.length()-1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode top = queue.poll();
            if (!str[i].equals("null")){
                top.left = new TreeNode(Integer.parseInt(str[i]));
                queue.offer(top.left);
            }
            i++;
            if (!str[i].equals("null")){
                top.right = new TreeNode(Integer.parseInt(str[i]));
                queue.offer(top.right);
            }
            i++;
        }
        return root;
    }
}
