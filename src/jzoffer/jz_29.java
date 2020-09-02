package jzoffer;

public class jz_29 {
    public String myTrim (String str) {
       int left = 0, right = str.length()-1;
       while(str.charAt(left) == ' ') {
           left++;
           if(str.charAt(left) != ' ') break;
       }
        while(str.charAt(right) == ' ') {
            right--;
            if(str.charAt(right) != ' ') break;
        }
        str = str.substring(left, right+1);
        return str;
    }

    public static void main(String[] args){
        jz_29 p = new jz_29();
        String str = "   123 321   ";
        System.out.println(p.myTrim(str));
    }
}
