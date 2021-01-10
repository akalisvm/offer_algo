package jzoffer;

import java.util.ArrayList;

public class jz_50 {
    public boolean duplicate(int[] numbers,int length,int [] duplication) {
        if(numbers == null || length == 0) {
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : numbers) {
            if(list.contains(i)) {
                duplication[0] = i;
                return true;
            } else {
                list.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args){
        jz_50 p = new jz_50();
        int[] numbers = new int[]{};
        int length = numbers.length;
        int[] duplication = new int[1];
        System.out.print(p.duplicate(numbers, length, duplication));
    }
}
