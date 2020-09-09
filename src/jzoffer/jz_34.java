package jzoffer;

import java.util.HashMap;

public class jz_34 {
    public int FirstNotRepeatingChar(String str){
        if(str == null || str.length() == 0 || str.length() > 10000) return -1;
        int result = -1;
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }
            else{
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }

        for(int i = 0; i < str.length(); i++){
            if(map.get(ch[i]) == 1){
                result = i;
                break;
            }
        }
        return result;
    }
}
