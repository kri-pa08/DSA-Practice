//ROOT-LEFT-RIGHT
 class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        left = null;
        right = null;

    }
}

public class Preorder{
    public static void main(String[] args){
       TreeNode root = new TreeNode(5);

       root.left = new TreeNode(9);
       root.right = new TreeNode(10);

       root.left.left = new TreeNode(3);
       root.left.right = new TreeNode(7);


       preorder(root);
    }

    static void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
}
