package jzoffer;

public class jz_55 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null || pHead.next == null) return null;

        ListNode fast = pHead;
        ListNode slow = pHead;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                ListNode slow2 = pHead;
                while(slow2 != slow) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }
}
