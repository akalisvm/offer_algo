package jzoffer;

public class jz_7 {
    public int Fibonacci(int n){
        if(n == 0 || n == 1) return n;
        int tmp = 0;
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++){
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return tmp;
    }

    public static void main(String[] args){
        jz_7 p = new jz_7();
        for(int i = 0; i < 40; i++){
            System.out.println(p.Fibonacci(i));
        }
    }
}
