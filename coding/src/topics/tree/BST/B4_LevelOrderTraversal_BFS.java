package topics.tree.BST;

import java.util.LinkedList;
import java.util.Queue;

public class B4_LevelOrderTraversal_BFS {


    /**
     * Iterate the Binary Tree in Level order[BFS].
     * <p>
     * <b>Example:</b>
     * <pre>
     * I/P:
     *
     *               1
     *              / \
     *             2   3
     *            / \
     *           4   5
     *
     *
     * O/P: [1,2,3,4,5,6]
     *
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/17mfFYm1fmjHe3JpeSdZPPtRWpLGD1Ofw/view?usp=drive_link" target="_blank">For Visualization</a>.
     * </p>
     *
     */
    public static void levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);


        while(!queue.isEmpty()){

            TreeNode currNode = queue.poll();

            System.out.print(currNode.val +" ");

            if(currNode.left!=null) queue.offer(currNode.left);
            if(currNode.right!=null) queue.offer(currNode.right);
        }

    }




    public static void main(String[] args) {

        // Manually create a tree like this:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        TreeNode root = getTreeNode();

        levelOrder(root); // Output: 1 2 3 4 5
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
