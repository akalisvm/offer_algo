package jzoffer;

public class jz_2 {
    public String replaceSpace(StringBuffer str){
        StringBuffer sb = new StringBuffer(str);
        char[] charArray = sb.toString().toCharArray();
        int n = 0;
        for (char c : charArray) {
            if (c == ' ') {
                n++;
            }
        }
        for(int i = 0; i < n; i++){
            sb.replace(sb.indexOf(" "), sb.indexOf(" ")+1, "%20");
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("We are happy");
        jz_2 p = new jz_2();
        System.out.print(p.replaceSpace(sb));
    }
}
