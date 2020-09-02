package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution17 {
    public List<String> letterCombinations(String digits) {
        List<String> mapping = new ArrayList<>();
        String[] letter = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digits.equals("")) return mapping;
        if(digits.length() == 1){
            int button1 = Integer.parseInt(String.valueOf(digits.charAt(0)))-2;
            int num1 = 3;
            if(button1 == 5 || button1 == 7) num1 = 4;
            String str1 = letter[button1];
            for(int i = 0; i < num1; i++){
                mapping.add(String.valueOf(str1.charAt(i)));
            }
        }
        if(digits.length() == 2) {
            int button1 = Integer.parseInt(String.valueOf(digits.charAt(0)))-2;
            int button2 = Integer.parseInt(String.valueOf(digits.charAt(1)))-2;
            int num1 = 3, num2 = 3;
            if(button1 == 5 || button1 == 7) num1 = 4;
            if(button2 == 5 || button2 == 7) num2 = 4;
            String str1 = letter[button1], str2 = letter[button2];
            for(int i = 0; i < num1; i++){
                for(int j = 0; j < num2; j++){
                    mapping.add(String.valueOf(str1.charAt(i))+ str2.charAt(j));
                }
            }
        }
        return mapping;
    }

    public static void main(String[] args){
        Solution17 s = new Solution17();
        String digits = "7";
        System.out.println(s.letterCombinations(digits));
    }
}
