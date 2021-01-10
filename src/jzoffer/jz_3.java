package jzoffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class jz_3 {
    private ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode tmp = listNode;
        while(tmp != null){
            stack.push(tmp.val);
            tmp = tmp.next;
        }
        while (!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args){
        jz_3 p = new jz_3();
        ListNode l = new ListNode(0);
        l.addNode(new ListNode(1));
        l.addNode(new ListNode(2));
        l.addNode(new ListNode(3));
        System.out.println(p.printListFromTailToHead(l));
    }
}
