package jzoffer;

import java.util.ArrayList;

public class jz_29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int length = input.length;
        if(k <= length){
            for(int i = 0; i < length-1; i++){
                for(int j = 0; j < length-1; j++){
                    if(input[j+1] < input[j]){
                        int temp = input[j];
                        input[j] = input[j+1];
                        input[j+1] = temp;
                    }
                }
            }
            for(int i = 0; i < k; i++){
                list.add(input[i]);
            }
        }
        return list;
    }

    public static void main(String[] args){
        jz_29 p = new jz_29();
        int[] input = new int[]{4,5,1,6,2,7,3,8};
        System.out.println(p.GetLeastNumbers_Solution(input,4));
    }
}
