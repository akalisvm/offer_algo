package leetcode;

import java.util.Arrays;

class leetcode_66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] x = new int[]{9,8,7,6,5,4,3,2,0,9};
        System.out.print(Arrays.toString(plusOne(x)));
    }
}

