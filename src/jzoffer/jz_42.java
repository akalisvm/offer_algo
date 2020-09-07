package jzoffer;

import java.util.ArrayList;

public class jz_42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int counter = 0;
        int result1 = sum;
        int result2 = sum;
        int mulResult = sum * sum;
        int temp1, temp2;
        while(counter != array.length){
            for(int i = counter; i < array.length-1; i++){
                temp1 = array[counter];
                temp2 = array[i+1];
                int mulTemp = temp1 * temp2;
                if(temp1 + temp2 == sum && mulTemp < mulResult){
                    result1 = temp1;
                    result2 = temp2;
                    mulResult = mulTemp;
                }
            }
            counter++;
        }
        if(result1 + result2 != 2*sum){
            list.add(result1);
            list.add(result2);
        }
        return list;
    }

    public static void main(String[] args){
        jz_42 p = new jz_42();
        int[] array = new int[]{1,2,4,7,11,15};
        System.out.print(p.FindNumbersWithSum(array,15));
    }
}
