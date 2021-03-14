package JianzhiOffer;

public class Offer_24_reverseList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {//答案
        ListNode ret =  null;
        ListNode curr = head;

        while (curr!=null){
            curr.next = ret;
            ListNode next = curr.next;
            ret = curr;
            curr = next;
        }
        return ret;
    }
    public ListNode reverseListNONONO(ListNode head) {//我写的
        if (head == null) return null;
        ListNode ret =  null;//代表什么返回的链表
        ListNode curr = head;//要不先不看了吧  先记住  下次

        while (head!=null){
            curr = head;
            head = head.next;
            curr.next = ret;
            ret = curr;
        }
        return ret;
    }
}
