package JianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import java.util.*;

public class Offer_32_2_levelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return list;
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> rows = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) { // 分层的关键
                TreeNode top = queue.poll();
                rows.add(top.val);
                if (top.left != null) queue.offer(top.left);
                if (top.right != null) queue.offer(top.right);
            }
            list.add(rows);
        }
        return list;

//        map.put(root,0);
//        while (!queue.isEmpty()) {
//            TreeNode top = queue.poll();
////            if (top != null) {
//            if (top.left != null){
//                map.put(top.left,map.get(top)+1);
//                queue.offer(top.left);
//            }
//            if (top.right != null){
//                map.put(top.right,map.get(top)+1);
//                queue.offer(top.right);
//            }
////            }
//        }
//        int i = 0;
//        Iterator<Map.Entry<TreeNode,Integer>> entries = map.entrySet().iterator();
//
//        Map.Entry<TreeNode,Integer> entry = entries.next();
//        while (entry != null) {
//            List<Integer> rows = new ArrayList<>();
//            while (entry != null) {
//                if (entries.next().getValue() == i) {
//                    rows.add(entries.next().getKey().val);
//                    entry = entries.next();
//                }
//            }
//            i++;
//        }
//
//        while (entries.hasNext()) {
//            Map.Entry<TreeNode,Integer> entry;
//            List<Integer> rows = new ArrayList<>();
//            while (entries.hasNext()) {
//                if (entries.next().getValue() == i) {
//                    rows.add(entries.next().getKey().val);
//                    entry = entries.next();
//                }
//            }
//            i++;
//        }


    }

    public List<List<Integer>> levelOrder1(TreeNode root) { //下面的代码 感觉逻辑没有问题，但是不太行
        List<List<Integer>> list = new ArrayList<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return list;
        queue.offer(root);
        map.put(root,0);
        while (!queue.isEmpty()) {
            TreeNode top = queue.poll();
//            if (top != null) {
            if (top.left != null){
                map.put(top.left,map.get(top)+1);
                queue.offer(top.left);
            }
            if (top.right != null){
                map.put(top.right,map.get(top)+1);
                queue.offer(top.right);
            }
//            }
        }
        int i = 0;
        Iterator<Map.Entry<TreeNode,Integer>> entries = map.entrySet().iterator();

        Map.Entry<TreeNode,Integer> entry = entries.next();
        List<Integer> nrows = new ArrayList<>();
        List<Integer> rows;
        while (entry != null) {
            rows = nrows;
            while (entry != null) {
                if (entry.getValue() == i) {
                    rows.add(entry.getKey().val);
                    entry = entries.next();
                } else {
                    list.add(rows);
                    nrows = new ArrayList<>();
                    nrows.add(entry.getKey().val);
                    break;
                }
            }
            i++;
        }
        return list;
    }
}
