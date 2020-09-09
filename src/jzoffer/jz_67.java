package jzoffer;

/*
    * when k equals to e, k[1]*...*k[m] becomes the largest,
    * so k should close to 2 or 3;
 */

public class jz_67 {
    public int cutRope (int target){
        int result = 1;
        while (target != 0){
            if(target == 2){
                result *= 2;
                target -= 2;
            }
            else if(target == 4){
                result *= 4;
                target -= 4;
            }
            else if(target >= 3){
                result *= 3;
                target -= 3;
            }
        }
        return result;
    }

    public static void main(String[] args){
        jz_67 p = new jz_67();
        int target = 17;
        System.out.println(p.cutRope(target));
    }
}
