package jzoffer;

public class jz_49 {
    public int StrToInt(String str){
        char[] ch = str.toCharArray();
        boolean neg = ch[0] == '-';
        int n = 0;
        for (char c : ch) {
            if (Character.isLetter(c)) {
                return 0;
            }
        }
        for(int i = 1; i < ch.length; i++){
            n *= 10;
            n += ch[i];
        }
        return neg?-n:n;
    }

    public static void main(String[] args){
        jz_49 p = new jz_49();
        String str1 = "+23";
        String str2 = "1a33";
        System.out.println(p.StrToInt(str1));
        System.out.println(p.StrToInt(str2));
    }
}
