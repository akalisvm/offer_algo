package jzoffer;

import java.util.ArrayList;
import java.util.Stack;

public class jz_5 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
        stack1.push(node);
    }

    public int pop() {
        if(stack2.size() <= 0){
            while(stack1.size() != 0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args){
        jz_5 p = new jz_5();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        p.push(list1.get(0));
        p.push(list1.get(1));
        p.push(list1.get(2));
        list2.add(p.pop());
        list2.add(p.pop());
        list1.add(4);
        p.push(list1.get(3));
        list2.add(p.pop());
        list2.add(p.pop());
        for(int i : list2){
            System.out.println(i);
        }
    }
}
