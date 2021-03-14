package JianzhiOffer;

import java.util.List;

public class Offer_25_mergeTwoLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //引入伪头节点
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode ret = new ListNode(0), curr = ret;
        while (l1!=null && l2 != null){
            if (l1.val > l2.val) {
                curr.next = l2;
                l2 = l2.next;
            } else{
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }
        curr.next = l1!=null? l1 : l2;
        return ret.next;
    }
    public ListNode mergeTwoListsNONONO(ListNode l1, ListNode l2) {
        ListNode l = l1, r = l2;
        ListNode ret = null;
        if (l == null) return l2;
        if (r == null) return l1;
        if (l.val > r.val) {
            ret = r;
            r = r.next;
        } else{
            ret = l;
            l = r.next;
        }
        ListNode tmp = ret;
        while(l != null && r != null){
            if (l.val > r.val) {
                tmp.next = r;
                r = r.next;
                tmp =  tmp.next;
            } else{
                tmp.next = l;
                l = r.next;
                tmp =  tmp.next;
            }
        }
        if (l!=null) tmp.next = l;
        if (r!=null) tmp.next = r;
        return ret;
    }
}
