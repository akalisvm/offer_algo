package jzoffer;

import java.util.ArrayList;

public class jz_13 {
    public void reOrderArray(int[] array) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 1) {
                list1.add(i);
            } else if (i % 2 == 0) {
                list2.add(i);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            array[i] = list1.get(i);
        }
        for(int i = list1.size(); i < array.length; i++){
            array[i] = list2.get(i-list1.size());
        }
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        jz_13 p = new jz_13();
        int[] array = new int[]{10,2,3};
        p.reOrderArray(array);
    }
}
