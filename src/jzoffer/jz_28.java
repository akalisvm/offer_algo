package jzoffer;

import java.util.HashMap;

public class jz_28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int half = array.length / 2;
        if(array.length == 1) return array[0];
        for(int i : array){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                int tmp = map.get(i);
                if(tmp + 1 > half) return i;
                map.put(i,tmp+1);
            }
        }
        return 0;
    }

    public static void main(String[] args){
        jz_28 p = new jz_28();
        int[] array = new int[]{1,2,3,2,2,2,5,4,2};
        System.out.print(p.MoreThanHalfNum_Solution(array));
    }
}
