package jzoffer;

public class jz_31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int[] numbers = new int[n];
        int k = 1;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = k;
            k++;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i : numbers){
            sb.append(i);
        }
        String str = sb.toString();
        char[] ch = str.toCharArray();
        int total = 0;
        for(char c : ch){
            if(c == '1')total++;
        }
        return total;
    }

    public static void main(String[] args){
        jz_31 p = new jz_31();
        int n = 13;
        System.out.print(p.NumberOf1Between1AndN_Solution(n));
    }
}
