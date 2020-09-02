package jzoffer;

public class jz_16 {
    public ListNode Merge(ListNode list1, ListNode list2){
        ListNode head = new ListNode(0);
        ListNode moveNode = head;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                moveNode.next = list2;
                list2 = list2.next;
            }
            else{
                moveNode.next = list1;
                list1 = list1.next;
            }
            moveNode = moveNode.next;
        }
        if (list1 != null) {
            moveNode.next = list1;
        }
        if (list2 != null) {
            moveNode.next = list2;
        }
        return head.next;
    }

    public static void main(String[] args){
        jz_16 p = new jz_16();
        ListNode l1 = new ListNode(0);
        l1.addNode(new ListNode(1));
        ListNode l2 = new ListNode(2);
        l2.addNode(new ListNode(3));
        System.out.println(p.Merge(l1, l2).val);
    }
}
