package jzoffer;

public class jz_43 {
    public String LeftRotateString(String str, int n){
        if(str == null || n <= 0 || n > str.length()) return str;
        String partA = str.substring(0,n);
        String partB = str.substring(n);
        return partB + partA;
    }

    public static void main(String[] args){
        jz_43 p = new jz_43();
        String str = "";
        int n = 6;
        System.out.println(p.LeftRotateString(str, n));
    }
}
