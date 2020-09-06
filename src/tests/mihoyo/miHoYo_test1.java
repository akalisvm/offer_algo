package tests.mihoyo;

/***
 * 1.实现两个分数的四则运算
 * ①输入描述：一行字符串，数据格式是"a/b o c/d"，其中a,b,c,d是一个1-9的整数，o是运算符“+-/*”其中一个，o前后有空格
 *
        * ②输出描述：运算结果，符合书写习惯，没有多余符号、分子、分母，并化简为最简单的分数
        *输入：1/8+3/8
        *输出：1/2
 **/

class Fraction{
    int a,b;
    Fraction(int a, int b){
        this.a = a;
        this.b = b;
    }

    double toDouble(){
        return (double)a/b;
    }

    Fraction plus(Fraction r){
        Fraction s = new Fraction(r.a, r.b);
        int h = s.b * a;
        s.a *= b;
        s.b *= b;
        s.a += h;
        return s;
    }

    Fraction minus(Fraction r){
        Fraction s = new Fraction(r.a, r.b);
        int h = s.b * a;
        s.a *= b;
        s.a = h - s.a;
        s.b *= b;
        return s;
    }

    Fraction multiply(Fraction r){
        r.a *= a;
        r.b *= b;
        return r;
    }

    Fraction divide(Fraction r){
        int tmp = r.a;
        r.a = r.b;
        r.b = tmp;
        r.a *= a;
        r.b *= b;
        return r;
    }

    void print(){
        int h;
        if(a >= 0){
            if(a >= b) h = gcd(a, b);
            else h = gcd(b, a);
            a /= h;
            b /= h;
            if(a % b == 0){
                System.out.println(a/b);
            }else{
                System.out.println(a+"/"+b);
            }
        }
        else {
            a *= -1;
            if(a >= b) h = gcd(a, b);
            else h = gcd(b, a);
            a /= h;
            b /= h;
            if(a % b == 0){
                System.out.println(a/b);
            }else{
                System.out.println(-a+"/"+b);
            }
        }
    }

    int gcd(int m, int n){
        if (m % n == 0) return n;
        return gcd(n, m % n);
    }
}

public class miHoYo_test1 {
    public void fractionCalculate(String str){
        str = str.trim().replaceAll(" ", "");
        int a = Integer.parseInt(String.valueOf(str.charAt(0)));
        int b = Integer.parseInt(String.valueOf(str.charAt(2)));
        char symbol = str.charAt(3);
        int c = Integer.parseInt(String.valueOf(str.charAt(4)));
        int d = Integer.parseInt(String.valueOf(str.charAt(6)));
        Fraction f1 = new Fraction(a,b);
        Fraction f2 = new Fraction(c,d);
        f1.print();
        f2.print();
        switch (symbol){
            case '+': f1.plus(f2).print(); break;
            case '-': f1.minus(f2).print(); break;
            case '*': f1.multiply(f2).print(); break;
            case '/': f1.divide(f2).print(); break;
        }
    }

    public static void main(String[] args){
        miHoYo_test1 m = new miHoYo_test1();
        String str = "  1/8 - 3/8  ";
        m.fractionCalculate(str);
    }
}
