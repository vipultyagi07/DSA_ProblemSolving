package topics.tree.BST;

import java.util.ArrayList;
import java.util.List;

public class B14_TreeBoundaryTraversal {

    static List<Integer> result = new ArrayList<>();


    public static void main(String[] args) {


        TreeNode root = getTreeNode();
        printLeft(root);
        printLeaves(root);

        System.out.println(result);

    }

    private static void printLeft(TreeNode root) {
        if(root==null){
            return;
        }

        while(isNotLeaf(root)){

            result.add(root.val);
            root= root.left;
        }


    }

    private static boolean isNotLeaf(TreeNode root) {

        return !(root.left == null && root.right == null);
    }

    private static void printLeaves(TreeNode root) {

        if(root.left==null && root.right==null){
            result.add(root.val);
            return;
        }

        printLeaves(root.left);
        printLeaves(root.right);

    }


    // Manually create a tree like this:
    //       1
    //      /  \
    //     2      3
    //    / \    / \
    //   4   5  6   7



    private static TreeNode getTreeNode() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

}
