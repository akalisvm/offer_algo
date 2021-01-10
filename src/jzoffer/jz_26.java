package jzoffer;

import java.util.ArrayList;

public class jz_26 {

    private void inOrderTraversal(TreeNode pRootOfTree, ArrayList<TreeNode> list) {
        if(pRootOfTree == null) return;
        inOrderTraversal(pRootOfTree.left, list);
        list.add(pRootOfTree);
        inOrderTraversal(pRootOfTree.right, list);
    }

    private TreeNode reLink(ArrayList<TreeNode> list) {
        for(int i = 0; i < list.size() - 1; i++){
            list.get(i).right = list.get(i + 1);
            list.get(i + 1).left = list.get(i);
        }
        return list.get(0);
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        ArrayList<TreeNode> list = new ArrayList<>();
        inOrderTraversal(pRootOfTree, list);
        return reLink(list);
    }
}
