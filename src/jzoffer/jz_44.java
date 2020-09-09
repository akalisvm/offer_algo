package jzoffer;

import java.util.regex.*;

public class jz_44 {
    public String ReverseSentence (String str){
        if(str == null || str.trim().length() == 0) return str;
        else if(str.equals(" ")) return str;
        String[] strArrayOriginal = str.split(" ");
        String[] strArrayFinal = new String[strArrayOriginal.length];
        for(int i = 0; i < strArrayOriginal.length; i++){
            int j = strArrayOriginal.length-i-1;
            strArrayFinal[j] = strArrayOriginal[i];
        }
        StringBuilder sb = new StringBuilder(" ");
        for(int i = 0; i < strArrayFinal.length; i++){
            if(i == strArrayFinal.length-1) sb.append(strArrayFinal[i]);
            else {
                sb.append(strArrayFinal[i]).append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        jz_44 p = new jz_44();
        String str = " ";
        System.out.println(p.ReverseSentence(str));
    }
}
