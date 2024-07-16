package Java;

public class Main2 {
    static class TreeNode{
        int val;
        TreeNode leftNode;
        TreeNode rightNode;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);

        root.leftNode = left;
        root.rightNode = right;

        invert(root);
        System.out.println(root.leftNode.val);
        System.out.println(root.rightNode.val);

    }

    public static TreeNode invert(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = invert(root.leftNode);
        TreeNode right = invert(root.rightNode);
        root.rightNode = left;
        root.leftNode = right;

        return root;
    }
}
