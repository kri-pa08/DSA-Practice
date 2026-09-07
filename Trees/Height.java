//Height of a tree
import java.util.*;
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

    public class Height{
        public static void main(String[] args){
            TreeNode root= new TreeNode(5);

            root.left = new TreeNode(9);
            root.right = new TreeNode(10);

            root.left.left = new TreeNode(3);
            root.left.right = new TreeNode(7);

            root.right.left = new TreeNode(6);

            int result = height(root);

            System.out.println("Height = " + result);

        }
        static int height(TreeNode root){
            if(root == null){
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return 1+Math.max(leftHeight, rightHeight);
        }
    }
