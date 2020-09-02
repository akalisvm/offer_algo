package jzoffer;

public class jz_17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2){
        if(root1 == null || root2 == null) return false;
        if(root1.val == root2.val){
            if(judge(root1, root2)){
                return true;
            }
        }
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }


    public boolean judge(TreeNode root, TreeNode subtree){
        if(subtree == null) return true;
        if(root == null) return false;
        if(root.val == subtree.val){
            return judge(root.left, subtree.left) && judge(root.right, subtree.right);
        }
        return false;
    }
}
