package jzoffer;

public class jz_23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0) return false;
        return helpVerify(sequence, 0, sequence.length-1);
    }

    private boolean helpVerify(int[] sequence, int start, int end) {
        if(start >= end) return true;
        int key = sequence[end];
        int i;
        for(i = start; i < end; i++) {
            if(sequence[i] > key) {
                break;
            }
        }
        for(int j = i; j < end; j++) {
            if(sequence[j] < key) {
                return false;
            }
        }
        return helpVerify(sequence, start, i-1) && helpVerify(sequence, i, end-1);
    }
}
