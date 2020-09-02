package jzoffer;

public class jz_12 {
    public double PowerCalculate(double base, int exponent){
        final double n = base;
        exponent = Math.abs(exponent);
        if(exponent == 0) return 1;
        if(exponent == 1) return base;
        while(exponent > 1){
            base *= n;
            exponent--;
        }
        return PowerCalculate(base, exponent);
    }

    public double Power(double base, int exponent){
        if(exponent >= 0) return PowerCalculate(base, exponent);
        else{
            return 1/PowerCalculate(base, exponent);
        }
    }

    public static void main(String[] args){
        jz_12 p = new jz_12();
        System.out.println(p.Power(3,-1));
    }
}
