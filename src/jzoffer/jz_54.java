package jzoffer;

import java.util.*;

public class jz_54 {
    private HashMap<Character, Integer> map = new HashMap<>();
    private ArrayList<Character> list = new ArrayList<>();

    //Insert one char from stringstream
    public void Insert (char ch) {
        if(!map.containsKey(ch)){
            map.put(ch,1);
            list.add(ch);
        }
        else{
            map.put(ch,2);
        }
    }

    //return the first appearance once char in current stringstream
    public char FirstAppearingOnce(){
        char result = '#';
        for(char ch : list){
            if(map.get(ch) == 1){
                result = ch;
                break;
            }
        }
        return result;
    }

    public static void main (String[] args) {
        jz_54 p = new jz_54();
        String str = "google";
        for(int i = 0; i < str.length(); i++){
            p.Insert(str.charAt(i));
        }
        System.out.println(p.FirstAppearingOnce());
    }
}
