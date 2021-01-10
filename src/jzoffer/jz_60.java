package jzoffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class jz_60 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(pRoot == null) return result;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.pop();
                list.add(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            result.add(list);
        }
        return result;
    }
}
