package jzoffer;


public class jz_49 {
    public int StrToInt(String str){
        if(str == null || "".equals(str.trim())) return 0;
        str = str.trim();
        int counter = 0;
        int flag = 1;
        if(str.charAt(0) == '-' || str.charAt(0) == '+') counter++;
        if(str.charAt(0) == '-') flag = -1;
        int res = 0;
        for(int i = counter; i < str.length(); i++) {
            if(isNumber(str.charAt(i))) {
                int cur = str.charAt(i) - '0';
                if(flag == 1 && (res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && cur>7)){
                    return 0;
                }
                else if(flag == -1 && (res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && cur>8)){
                    return 0;
                }
                res = res*10 + cur;
            }
            else return 0;
        }
        return flag*res;
    }

    public boolean isNumber (char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args){
        jz_49 p = new jz_49();
        String str1 = "23";
        String str2 = "1a33";
        System.out.println(p.StrToInt(str1));
        System.out.println(p.StrToInt(str2));
    }
}
