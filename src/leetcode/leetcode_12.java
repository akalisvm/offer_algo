package leetcode;

class Solution12 {
    public String intToRoman(int num){
        StringBuilder sb = new StringBuilder("");
        int[] integers = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int n = integers.length;
        while(num != 0){
            for(int i = 0; i < n; i++){
                if(num >= integers[i]){
                    sb.append(roman[i]);
                    num -= integers[i];
                    break;
                }
            }
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args){
        Solution12 s = new Solution12();
        int x = 412;
        System.out.println(s.intToRoman(x));
    }
}
