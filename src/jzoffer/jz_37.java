package jzoffer;

public class jz_37 {
    public int GetNumberOfK(int[] array, int k){
        int n = 0;
        for(int i : array) {
            if (i == k) n++;
            else if(i == k+1) break;
        }
        return n;
    }

}
