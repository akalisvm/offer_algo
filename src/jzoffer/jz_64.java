package jzoffer;

import java.util.ArrayList;

public class jz_64 {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if(num == null || size == 0 || size > num.length) return list;
        int start = 0;
        int end = size-1;

        while(end != num.length) {
            int max = Integer.MIN_VALUE;
            for(int i = start; i <= end; i++) {
                if(num[i] > max) {
                    max = num[i];
                }
            }
            list.add(max);
            start++;
            end++;
        }

        return list;
    }
}
