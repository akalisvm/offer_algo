package jzoffer;

public class jz_58 {
    public boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null) return true;
        return in(pRoot.left, pRoot.right);
    }

    private static boolean in(TreeNode l1, TreeNode l2) {
        if(l1 == null && l2 == null) return true;
        if(l1 == null || l2 == null) return false;
        return l1.val == l2.val && in(l1.left, l2.right) && in(l1.right, l2.left);
    }
}
