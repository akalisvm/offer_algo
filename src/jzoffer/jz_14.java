package jzoffer;

public class jz_14 {
    public ListNode FindKthToTail (ListNode head, int k){
        ListNode tmp1 = head;
        int length = 0;
        while(tmp1 != null){
            length++;
            tmp1 = tmp1.next;
        }
        ListNode tmp2 = head;
        if(length < k){
            return null;
        }
        else{
            int counter = length - k;
            for(int i = 0; i < counter; i++){
                tmp2 = tmp2.next;
            }
        }
        return tmp2;
    }

    public static void main(String[] args){
        jz_14 p = new jz_14();
        ListNode l = new ListNode(0);
        l.addNode(new ListNode(1));
        l.addNode(new ListNode(2));
        l.addNode(new ListNode(3));
        System.out.println(p.FindKthToTail(l, 4).val);
    }
}
