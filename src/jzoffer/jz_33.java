package jzoffer;

public class jz_33 {
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0) return 0;
        if(index < 7) return index;
        int[] result = new int[index];
        result[0] = 1;
        int pos2 = 0;
        int pos3 = 0;
        int pos5 = 0;
        for(int i = 1; i < index; i++) {
            result[i] = minimumNumber(result[pos2]*2, result[pos3]*3, result[pos5]*5);
            System.out.println("result["+i+"]: "+result[i]);
            if(result[i] == result[pos2]*2) pos2++;
            System.out.println("pos2: " + pos2);
            System.out.println("result[pos2]: "+result[pos2]);
            System.out.println("result[pos2]*2: "+result[pos2]*2);
            if(result[i] == result[pos3]*3) pos3++;
            System.out.println("pos3: " + pos3);
            System.out.println("result[pos3]: "+result[pos3]);
            System.out.println("result[pos3]*3: "+result[pos3]*3);
            if(result[i] == result[pos5]*5) pos5++;
            System.out.println("pos5: " + pos5);
            System.out.println("result[pos5]: "+result[pos5]);
            System.out.println("result[pos5]*5: "+result[pos5]*5);
            System.out.println();
        }
        return result[index-1];
    }

    public int minimumNumber (int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        jz_33 p = new jz_33();
        System.out.println(p.GetUglyNumber_Solution(10));
    }
}
