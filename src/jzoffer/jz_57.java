package jzoffer;

import java.util.ArrayList;

public class jz_57 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode == null) return null;
        ArrayList<TreeLinkNode> list = new ArrayList<>();
        TreeLinkNode root  = pNode;
        while(root.next != null) {
            root = root.next;
        }
        inOrderTraversal(root, list);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == pNode) {
                return i == list.size()-1 ? null : list.get(i+1);
            }
        }
        return null;
    }

    private void inOrderTraversal(TreeLinkNode pNode, ArrayList<TreeLinkNode> list) {
        if(pNode == null) return;
        inOrderTraversal(pNode.left, list);
        list.add(pNode);
        inOrderTraversal(pNode.right, list);
    }
}
