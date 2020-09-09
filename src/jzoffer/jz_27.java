package jzoffer;

import java.util.ArrayList;
import java.util.Arrays;

public class jz_27 {
    public ArrayList<String> PermutationRecursion(StringBuilder str) {
        ArrayList<String> list = new ArrayList<>();
        if(str.length() == 1) list.add(str.toString());
        else{
            for(int i = 0; i < str.length(); i++){
                if(i == 0 || str.charAt(i) != str.charAt(0)){
                    char temp = str.charAt(i);
                    str.setCharAt(i, str.charAt(0));
                    str.setCharAt(0, temp);
                    ArrayList<String> newList = PermutationRecursion(new StringBuilder(str.substring(1)));
                    for (String s : newList) {
                        list.add(str.substring(0, 1) + s);
                    }
                    temp = str.charAt(0);
                    str.setCharAt(0, str.charAt(i));
                    str.setCharAt(i, temp);
                }
            }
        }
        return list;
    }

    public ArrayList<String> Permutation(String str) {
        StringBuilder sb = new StringBuilder(str);
        return PermutationRecursion(sb);
    }

    public static void main(String[] args){
        jz_27 p = new jz_27();
        String str = "abc";
        System.out.println(p.Permutation(str));
    }
}
