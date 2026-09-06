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

    public class Postorder{
        public static void main(String[] args){
            TreeNode root= new TreeNode(5);

            root.left = new TreeNode(9);
            root.right = new TreeNode(10);

            root.left.left = new TreeNode(3);
            root.left.right = new TreeNode(7);

            postorder(root);
        }
    
    static void postorder(TreeNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
}
