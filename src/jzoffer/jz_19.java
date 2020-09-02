package jzoffer;

import java.util.ArrayList;

public class jz_19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix == null) return list;
        int top = 0;
        int bottom = matrix.length -1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            for(int i = top+1; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            if(top < bottom){
                for(int i = right-1; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
            }
            if(left < right){
                for(int i = bottom-1; i >= top+1; i--){
                    list.add(matrix[i][left]);
                }
            }

            top++;
            bottom--;
            left++;
            right--;
        }
        return list;
    }

    public static void main(String[] args){
        jz_19 p = new jz_19();
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        for(int i : p.printMatrix(matrix)){
            System.out.print(i + " ");
        }
    }
}
