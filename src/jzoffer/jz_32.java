package jzoffer;

import java.util.ArrayList;

public class jz_32 {
    public String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0) return "";
        String str = "";
        if(numbers.length == 1) str += numbers[0];
        else {
            ArrayList<Integer> list = new ArrayList<>();
            int flag = 0;
            for (int i = 0; i < numbers.length-1; i++){
                int a = Integer.parseInt(String.valueOf(numbers[flag]) + numbers[i+1]);
                int b = Integer.parseInt(String.valueOf(numbers[i+1]) + numbers[flag]);
                if (b < a) flag = i + 1;
            }
            str += numbers[flag];
            for(int i = 0; i < numbers.length; i++) {
                if(i != flag){
                    list.add(numbers[i]);
                }
            }
            int[] newNumbers = new int[list.size()];
            for(int i = 0; i < newNumbers.length; i++){
                newNumbers[i] = list.get(i);
            }
            str += PrintMinNumber(newNumbers);
        }
        return str;
    }

    public static void main(String[] args) {
        jz_32 p = new jz_32();
        int[] numbers = new int[]{3,32,321};
        System.out.println(p.PrintMinNumber(numbers));
    }
}
