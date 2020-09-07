package jzoffer;

import java.util.*;

public class jz_40 {
    public void FindNumsAppearOnce(int[] array, int[] num1, int[] num2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : array){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,2);
            }
        }
        Iterator iter = map.entrySet().iterator();
        int counter = 0;
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            int key = (int) entry.getKey();
            int value = (int) entry.getValue();
            if(value == 1){
                if(counter == 0){
                    num1[0] = key;
                    counter++;
                }
                else{
                    num2[0] = key;
                }
            }
        }
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }

    public static void main(String[] args){
        jz_40 p = new jz_40();
        int[] array = new int[]{1,1,2,3,3,4};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        p.FindNumsAppearOnce(array,num1,num2);
    }
}
