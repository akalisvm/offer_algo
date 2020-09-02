package jzoffer;

public class jz_6 {
    public int minNumberInRotateArray(int[] array){
        if(array.length == 0) return 0;
        int min = array[0];
        for(int i : array){
            if(min > i){
                min = i;
            }
        }
        return min;
    }

    public int  minNumberInRotateArrayLog(int[] array){
        if(array.length == 0) return 0;
        int first = 0, last = array.length-1;
        while(first < last){
            if(array[first] < array[last]){
                return array[first];
            }
            int mid = first + (last - first)/2;
            if(array[mid] > array[last]){
                first = mid+1;
            }
            else if(array[mid] < array[last]){
                last = mid;
            }
            else {
                last--;
            }
        }
        return array[first];
    }

    public static void main(String[] args){
        jz_6 p = new jz_6();
        int[] array = new int[] {3,4,5,1,2};
        System.out.println(p.minNumberInRotateArrayLog(array));
        //遍历查找耗时:249ms
        //二分查找耗时:179ms
    }
}
