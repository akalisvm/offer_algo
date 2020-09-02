package jzoffer;

public class jz_11 {
    public int NumberOf1(int n) {
        int num = 0;
        while (n != 0) {
            num++;
            n &= (n - 1);
            //System.out.println(n);
        }
        return num;
    }

    public static void main(String[] args){
        jz_11 p = new jz_11();
        System.out.println(p.NumberOf1(57));
        System.out.println(p.NumberOf1(-57));
    }
}
