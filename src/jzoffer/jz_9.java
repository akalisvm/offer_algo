package jzoffer;

public class jz_9 {
    public int JumpFloorII(int target){
        int n = 1;
        for(int i = 2; i <= target; i++){
            n = 2*n;
        }
        return n;
    }

    public static void main(String[] args){
        jz_9 p = new jz_9();
        for(int i = 1; i <= 10; i++){
            System.out.println(p.JumpFloorII(i));
        }
    }
}
