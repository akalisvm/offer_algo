package leetcode;

public class leetcode_8{
    public static int myAtoi(String str) {
        str = str.trim();
        if(str.length() == 0) return 0;
        if(!Character.isDigit(str.charAt(0)) && str.charAt(0) != '-' && str.charAt(0) != '+') return 0;
        long ans = 0L;
        boolean neg = str.charAt(0) == '-';
        int i = Character.isDigit(str.charAt(0)) ? 0 : 1;
        while (i < str.length() && Character.isDigit(str.charAt(i))){
            ans = ans * 10 + (str.charAt(i++) - '0');
            if (!neg && ans > Integer.MAX_VALUE) {
                ans = Integer.MAX_VALUE;
                break;
            }
            if (neg && 1L + ans > Integer.MAX_VALUE) {
                ans = 1L + Integer.MAX_VALUE;
                break;
            }
        }
        return (int) (neg ? -ans : ans);
    }

    public static void main(String[] args){
        String str1 = "42", str2 = "   -42", str3 = "4193 with words", str4 = "words and 987", str5 = "2147483648";
        System.out.println(myAtoi(str1));
        System.out.println(myAtoi(str2));
        System.out.println(myAtoi(str3));
        System.out.println(myAtoi(str4));
        System.out.println(myAtoi(str5));
    }
}