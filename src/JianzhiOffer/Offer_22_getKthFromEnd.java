package JianzhiOffer;

/* 输入一个链表，输出该链表中倒数第k个节点。
为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。
这个链表的倒数第 3 个节点是值为 4 的节点。
        示例：

        给定一个链表: 1->2->3->4->5, 和 k = 2.

        返回链表 4->5.
*/

public class Offer_22_getKthFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode latter = head, former = head;
        while(k!=0){
            k--;
            if (former==null) return null;
            former = former.next;
        }
        while (former!=null){
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
    public ListNode getKthFromEnd1(ListNode head, int k) {
        if(head == null) return null;
        ListNode current = head;
        int len = 0;
        while(current!=null){
            len++;
            current = current.next;
        }
        ListNode ret;
        for(int i = 1; i <= len-k; i++){
            head = head.next;
        }
        return head;
    }
}
