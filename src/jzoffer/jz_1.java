package jzoffer;

public class jz_1 {
    public boolean Find(int target, int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] array = {
                {1,2,3},
                {4,5,6}
        };
        jz_1 p = new jz_1();
        System.out.println(p.Find(1, array));
    }
}
