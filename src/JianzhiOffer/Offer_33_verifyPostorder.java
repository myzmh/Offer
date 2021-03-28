package JianzhiOffer;

import java.util.Stack;

public class Offer_33_verifyPostorder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > root) return false;//要保证根节点的左子树全都小于根节点
            while (!stack.isEmpty() && postorder[i] < stack.peek())
                root = stack.pop(); // 此处把所有大于根节点的右子树弹出来  得到新的根节点
            stack.push(postorder[i]);
        }
        return true;
    }

    public boolean verifyPostorder1(int[] postorder) {
        return recur(postorder, 0, postorder.length-1);
    }

    public boolean recur(int[] postorder, int i, int j) {
        if (i >= j) return true;
        int m = j-1;
        while (m >= i && postorder[m] > postorder[j]) m--;
        int p = m;
        while (p >= i && postorder[p] < postorder[j]) p--;
        return p == i-1 && recur(postorder,i,m) && recur(postorder,m+1,j-1);
    }
}
