package leetcode;

class Solution50 {
    public double myPow(double x, int n) {
        if(x < -100.0 || x > 100.0) return 0;
        else if(n == 0) return 1.0;
        else if(n > 0){
            double tmp = x;
            for(int i = 0; i < n-1; i++){
                x = x * tmp;
            }
            return x;
        }
        else{
            double y = 1/x;
            for(int i = 0; i < Math.abs(n)-1; i++){
                y = y * y;
            }
            return y;
        }
    }

    public static void main(String[] args) {
        Solution50 s = new Solution50();
        System.out.println(s.myPow(34, -3));
    }
}