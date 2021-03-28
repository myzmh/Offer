package JianzhiOffer;

public class Offer_18_deleteNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteNode(ListNode head, int val) {
        if (val == head.val) {
            return head.next;
        }
        ListNode ret = head;
        while (ret.next!=null){
            if (ret.next.val != val) {
                ret = ret.next;
            } else {
                ret.next = ret.next.next;
            }
        }
        return head;
    }
}
