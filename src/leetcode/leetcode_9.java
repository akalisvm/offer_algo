package leetcode;

public class leetcode_9 {
    public static boolean isPalindrome(int x) {
        boolean ans = false;
        if (x == 0) ans = true;
        if (x == reverse(x)) ans = true;
        return ans;
    }

    public static int reverse(int x){
        int tmp = 0;
        while(x > 0){
            tmp *= 10;
            tmp += x % 10;
            x = x / 10;
        }
        return tmp;
    }
}
