package jzoffer;

import java.util.ArrayList;

public class jz_24 {

    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null || target <= 0) return result;
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<>(list));
        }
        ArrayList<ArrayList<Integer>> result1 = FindPath(root.left, target);
        ArrayList<ArrayList<Integer>> result2 = FindPath(root.right, target);
        list.remove(list.size()-1);
        return result;
    }
}
