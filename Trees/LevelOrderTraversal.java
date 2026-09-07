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

    public class LevelOrderTraversal{
        public static void main(String[] args){
            TreeNode root= new TreeNode(5);

            root.left = new TreeNode(9);
            root.right = new TreeNode(10);

            root.left.left = new TreeNode(3);
            root.left.right = new TreeNode(7);

            root.right.left = new TreeNode(6);

            levelorder(root);

        }
        static void levelorder(TreeNode root){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                TreeNode current = queue.remove();
                System.out.println(current.data);

                if(current.left != null){
                    queue.add(current.left);

                }

                if(current.right != null){
                    queue.add(current.right);
                }
            }
        }
    }



    