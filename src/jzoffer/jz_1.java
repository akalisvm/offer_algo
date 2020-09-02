package jzoffer;

import java.util.Arrays;

public class jz_1 {
    public boolean Find(int target, int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] array = {
                {1,2,3},
                {4,5,6}
        };
        jz_1 p = new jz_1();
        System.out.println(p.Find(1, array));
    }
}
