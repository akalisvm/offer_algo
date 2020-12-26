package leetcode;

class leetcode_7 {
    public static int reverse(int x) {
        long result = 0;
        int tmp = Math.abs(x);
        while (tmp > 0){
            result *= 10;
            result += tmp % 10;
            if(result > Integer.MAX_VALUE || result < -Integer.MAX_VALUE){
                return 0;
            }
            tmp /= 10;
        }
        if (x < 0){
            return (int) -result;
        }
        else
            return (int) result;

    }

    public static void main(String[] args) {
        int x = 321;
        System.out.print(reverse(x));
    }
}
