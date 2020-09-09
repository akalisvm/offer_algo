package jzoffer;

import java.util.*;

public class jz_45 {
    public boolean isContinuous (int [] numbers) {
        boolean flag = false;
        Arrays.sort(numbers);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : numbers){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                if(i != 0) return false;
                else{
                    map.put(0,map.get(0)+1);
                }
            }
        }
        int start = 0;
        for(int i : numbers) {
            if(i != 0) {
                start = i;
                break;
            }
        }
        int n = 0;
        for(int i = start; i < start + 5; i++) {
            if(map.containsKey(i)) n++;
        }
        if(map.containsKey(0)) n += map.get(0);
        if(n == 5) flag = true;
        return flag;
    }

    public static void main(String[] args){
        jz_45 p = new jz_45();
        int[] numbers = new int[]{1,3,2,5,4};
        System.out.println(p.isContinuous(numbers));
    }
}
