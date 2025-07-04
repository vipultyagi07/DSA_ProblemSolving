package topics.tree.BST;

public class B2_PreOrderTraversal {

    public static void preorder(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        // Manually create a tree like this:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        TreeNode root = getTreeNode();

        preorder(root); // Output: 1 2 4 5 3
    }

    private static TreeNode getTreeNode() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

}