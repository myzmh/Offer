package JianzhiOffer;

import java.util.LinkedList;
import java.util.Queue;

public class Offer_26_isSubStructure {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return dfs(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right, B);
    }

    public boolean dfs(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null) return false;
        return A.val == B.val && dfs(A.left, B.left) && dfs(A.right, B.right);
    }

//    boolean b = false;
//    public boolean isSubStructure(TreeNode A, TreeNode B) {
////        TreeNode tmp = A;
//        dfs(A,B);
//        return b;
//    }
//
//    public void dfs(TreeNode A, TreeNode B) {
//        if (b == false && A != null){
//            if (A.val != B.val) {
//                dfs(A.left,B);
//                dfs(A.right,B);
//            } else {
//                //对AB遍历，看是否一样
//                Queue<TreeNode> queueA = new LinkedList<TreeNode>();
//                Queue<TreeNode> queueB = new LinkedList<TreeNode>();
//                queueA.offer(A);
//                queueB.offer(B);
//                while (!queueB.isEmpty()){
//                    TreeNode topA = queueA.peek();
//                    TreeNode topB = queueB.peek();
//                    if ((topA == null && topB == null)||(topA != null && topB != null && topB.val == topA.val)) {
//                        queueA.remove();
//                        queueB.remove();
//                        queueA.offer(A.left);
//                        queueA.offer(A.right);
//                        queueB.offer(B.left);
//                        queueB.offer(B.right);
//                    } else break;
//                }
//                if (queueB.isEmpty()) b = true;
//            }
//        }
//    }
}
