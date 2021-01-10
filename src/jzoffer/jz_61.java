package jzoffer;

public class jz_61 {

    private int index = 0;

    public String Serialize(TreeNode root) {
        if(root == null) return "";
        return helpSerialize(root, new StringBuilder()).toString();
    }

    private StringBuilder helpSerialize(TreeNode root, StringBuilder sb) {
        sb.append(root.val).append("!");
        if(root.left != null) {
            helpSerialize(root.left, sb);
        } else {
            sb.append("#!");
        }
        if(root.right != null) {
            helpSerialize(root.right, sb);
        } else {
            sb.append("#!");
        }
        return sb;
    }

    public TreeNode Deserialize(String str) {
        if(str == null || str.length() == 0) return null;
        String[] split = str.split("!");
        return helpDeserialize(split);
    }

    private TreeNode helpDeserialize(String[] strings) {
        if(strings[index].equals("#")) {
            index++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(strings[index]));
        index++;
        root.left = helpDeserialize(strings);
        root.right = helpDeserialize(strings);
        return root;
    }
}
