package jzoffer;

import java.util.Arrays;

public class jz_51 {
    public int[] multiply(int[] A) {
        if(A.length <= 1) return null;

        int productHead = 1, productTail = 1;
        for(int i = 1; i < A.length; i++) {
            productHead *= A[i];
        }

        for(int i = 0; i < A.length-1; i++) {
            productTail *= A[i];
        }

        int[] result = new int[A.length];
        result[0] = productHead;
        result[result.length-1] = productTail;
        if(result.length != 2) {
            for(int i = 1; i < result.length-1; i++) {
                int productBody = 1;
                for(int j = 0; j < A.length; j++) {
                    if(i != j) {
                        productBody *= A[j];
                    }
                }
                result[i] = productBody;
            }
        } else {
            return result;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(new jz_51().multiply(A)));
    }
}
