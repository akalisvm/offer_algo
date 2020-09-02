package jzoffer;

public class jz_15 {
    public ListNode ReverseList (ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args){
        jz_15 p = new jz_15();
        ListNode l = new ListNode(0);
        l.addNode(new ListNode(1));
        l.addNode(new ListNode(2));
        l.addNode(new ListNode(3));
        System.out.println(p.ReverseList(l).val);
    }
}
