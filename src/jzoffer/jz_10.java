package jzoffer;

public class jz_10 {
    public int RectCover(int target){
        if(target == 0 | target == 1 | target == 2){
            return target;
        }
        return RectCover(target - 1) + RectCover(target - 2);
    }

    public static void main(String[] args){
        jz_10 p = new jz_10();
        for(int i = 1; i <= 10; i++){
            System.out.println(p.RectCover(i));
        }
    }
}
