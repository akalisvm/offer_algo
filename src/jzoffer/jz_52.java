package jzoffer;

import java.util.regex.*;

public class jz_52 {
    public boolean match(char[] str, char[] pattern)
    {
        String strString = String.valueOf(str);
        String patternString = String.valueOf(pattern);
        return Pattern.matches(patternString, strString);
    }
}
