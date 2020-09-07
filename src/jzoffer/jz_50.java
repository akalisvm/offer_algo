package jzoffer;

import java.util.Arrays;

public class jz_50 {
    public boolean duplicate(int[] numbers, int length, int[] duplication){
        boolean flag = false;
        if(numbers == null || length == 0) {
            duplication[0] = -1;
            return false;
        }
        Arrays.sort(numbers);
        for(int i = 0; i < length-1; i++){
            if(numbers[i] == numbers[i+1]){
                duplication[0] = numbers[i];
                flag = true;
                break;
            }
        }
        if(!flag){ duplication[0] = -1; }
        System.out.print(duplication[0] + " ");
        return flag;
    }

    public static void main(String[] args){
        jz_50 p = new jz_50();
        int[] numbers = new int[]{};
        int length = numbers.length;
        int[] duplication = new int[1];
        System.out.print(p.duplicate(numbers, length, duplication));
    }
}
