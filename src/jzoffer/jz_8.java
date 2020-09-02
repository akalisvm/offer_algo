package jzoffer;

public class jz_8 {
    public int JumpFloor(int target) {
        // 1 2 3 4 5
        // 1 2 3 5 8
        if(target == 0 || target == 1) return target;
        int tmp = 0, a = 1, b = 1;
        for(int i = 2; i <= target; i++){
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return tmp;
    }

    public static void main(String[] args){
        jz_8 p = new jz_8();
        for(int i = 1; i < 40; i++){
            System.out.println(p.JumpFloor(i));
        }
    }
}
