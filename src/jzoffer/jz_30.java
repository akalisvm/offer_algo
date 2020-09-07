package jzoffer;

public class jz_30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length != 0){
            int counter = 0;
            int max = Integer.MIN_VALUE;
            while(counter != array.length){
                int temp = 0;
                for(int i = counter; i < array.length; i++){
                    temp += array[i];
                    if(temp > max){
                        max = temp;
                    }
                }
                counter++;
            }
            return max;
        }
        return 0;
    }

    public static void main(String[] args){
        jz_30 p = new jz_30();
        int[] array = new int[]{6,-3,-2,7,-15,1,2,2};
        System.out.print(p.FindGreatestSumOfSubArray(array));
    }
}
