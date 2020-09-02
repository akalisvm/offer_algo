package jzoffer;

import java.util.Stack;

public class jz_21 {
    public boolean IsPopOrder(int[] pushA, int[] popA){
        if(pushA == null || popA == null || pushA.length != popA.length) return false;
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int value : pushA) {
            stack.push(value);
            while (!stack.isEmpty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        jz_21 p = new jz_21();
        int[] pushA = new int[]{1,2,3,4,5};
        int[] popA = new int[]{4,5,3,2,1};
        System.out.println(p.IsPopOrder(pushA, popA));
    }
}
