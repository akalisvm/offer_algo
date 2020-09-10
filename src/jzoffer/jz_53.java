package jzoffer;

import java.util.regex.*;

public class jz_53 {
    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        String pattern = "^[-+]?(\\.)?\\d+(e(-|\\+)?|E(-|\\+)?|\\.)?\\d*(e(-|\\+)?|E(-|\\+)?)?\\d+$";
        return Pattern.matches(pattern, string);
    }

    public static void main(String[] args){
        jz_53 p = new jz_53();
        String string = "5e2";
        char[] str = string.toCharArray();
        System.out.println(p.isNumeric(str));
    }
}
