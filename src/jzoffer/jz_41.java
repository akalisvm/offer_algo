package jzoffer;

import java.util.ArrayList;

public class jz_41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
        ArrayList<ArrayList<Integer>> allSequence = new ArrayList<>();
        int counter = 1;
        while(counter != sum){
            int temp = 0;
            ArrayList<Integer> singleSequence = new ArrayList<>();
            for(int i = counter; i < sum; i++){
                temp += i;
                singleSequence.add(i);
                if(temp == sum){
                    allSequence.add(singleSequence);
                    break;
                }
                if(temp > sum){
                    singleSequence.clear();
                }
            }
            counter++;
        }
        return allSequence;
    }

    public static void main(String[] args){
        jz_41 p = new jz_41();
        int sum = 3;
        System.out.print(p.FindContinuousSequence(sum));
    }
}
