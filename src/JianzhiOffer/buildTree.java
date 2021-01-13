package JianzhiOffer;

import sun.reflect.generics.tree.Tree;

import java.util.*;

//
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> indexMap = new HashMap<Integer,Integer>();
        int length = inorder.length;
        for(int i=0;i<length;i++){
            indexMap.put(inorder[i],i);
        }
        TreeNode root2 = buildTree(0,length-1,preorder,0,length-1,inorder, indexMap);
        return root2;
    }

    public TreeNode buildTree(int preStart, int preEnd, int[] preorder, int inStart, int inEnd, int[] inorder, Map<Integer, Integer> indexMap){
        if (preStart>preEnd) return null;

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        if (preStart == preEnd) return root;

        int indexRoot = indexMap.get(rootVal);
        int leftNodes = indexRoot-inStart;
        int rightNodes = inEnd - indexRoot;

        TreeNode rightC = buildTree(preEnd - rightNodes + 1, preEnd, preorder, indexRoot + 1, inEnd, inorder, indexMap);
        TreeNode leftC = buildTree(preStart+1, preStart + leftNodes, preorder, inStart,indexRoot - 1, inorder, indexMap);

        root.left = leftC;
        root.right = rightC;
        return root;//你这对吗
    }

    public static void main(String[] args) {
        int[] preorder ={1,2,4,5,3,6,7};
        int[] pre=new int[10];
        List<String> a=new ArrayList<>();
        Set<Integer> b=new HashSet<>();
        int[] inorder = {4,2,5,1,6,3,7};

        TreeNode root = new buildTree().buildTree(preorder,inorder);
        System.out.println(3);
    }
}
