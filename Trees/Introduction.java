//How to write a basic code for tree (node, left child, right child)
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Introduction {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(9);
        root.right = new TreeNode(10);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
    }
}