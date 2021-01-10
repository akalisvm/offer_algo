package leetcode;

public class leetcode_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        int length = Integer.MAX_VALUE;
        for(String s : strs) {
            if(s.length() < length) {
                length = s.length();
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(i) != c) {
                    return sb.toString();
                } else if(strs[strs.length-1].charAt(i) == c && j == strs.length-1) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.print(new leetcode_14().longestCommonPrefix(strs));
    }
}
