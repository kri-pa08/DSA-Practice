//Left, Root, Right
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

public class Inorder{
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(9);
        root.right = new TreeNode(10);


        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        inorder(root);

    }

    static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);

        System.out.println(root.data);

        inorder(root.right);

    }
}