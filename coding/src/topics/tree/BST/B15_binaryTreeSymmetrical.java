package topics.tree.BST;

public class B15_binaryTreeSymmetrical {

    public static void main(String[] args) {


        TreeNode root = getTreeNode();

        Boolean result = isSymmetricTree(root,root);

        System.out.println(result);







    }

    public static boolean isSymmetricTree(TreeNode left , TreeNode right){

        if(left == null || right == null){
            return left== right;
        }

        if(left.val != right.val){
            return false;
        }

        boolean leftSide = isSymmetricTree(left.left, right.right);
        boolean rightSide = isSymmetricTree(left.right, right.left);

        return  leftSide && rightSide;
    }


    private static TreeNode getTreeNode() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);


        root.left.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(6);


        root.right.right.left = new TreeNode(6);
        root.right.right.right = new TreeNode(5);


        return root;
    }


}
