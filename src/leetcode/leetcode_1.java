package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution1{
    //Directly calculating
    public int[] twoSum1(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if (target - nums[j] == nums[i] && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSum2(int[] nums, int target){
        //Hash tables twice
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSum3(int[] nums, int target){
        //Hash tables once
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        Solution1 s = new Solution1();
        System.out.print(Arrays.toString(s.twoSum1(nums, target)));
    }
}