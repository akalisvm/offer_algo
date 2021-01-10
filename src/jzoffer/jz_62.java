package jzoffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class jz_62 {

    private void postOrderTraversal(TreeNode pRoot, HashMap<Integer, TreeNode> map, ArrayList<Integer> list) {
        if(pRoot == null) return;
        postOrderTraversal(pRoot.left, map, list);
        postOrderTraversal(pRoot.right, map, list);
        map.put(pRoot.val, pRoot);
        list.add(pRoot.val);
    }

    public TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot == null || k <= 0) return null;
        HashMap<Integer, TreeNode> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        postOrderTraversal(pRoot, map, list);
        if(k > list.size()) return null;
        Collections.sort(list);
        return map.get(list.get(k-1));
    }
}
